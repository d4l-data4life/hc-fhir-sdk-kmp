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
 * FhirOrganizationAffiliation
 *
 * Defines an affiliation/assotiation/relationship between 2 distinct oganizations, that is not a part-
 * of relationship/sub-division relationship
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/OrganizationAffiliation">OrganizationAffiliation</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/OrganizationAffiliation)
 */
interface FhirOrganizationAffiliation : FhirDomainResource {

    /**
     * Business identifiers that are specific to this role.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * Whether this organization affiliation record is in active use.
     */
    val active: Bool?

    /**
     * The period during which the participatingOrganization is affiliated with the
     * primary organization.
     */
    val period: Period?

    /**
     * Organization where the role is available.
     */
    val organization: Reference?

    /**
     * Organization that provides/performs the role (e.g. providing services or is a
     * member of).
     */
    val participatingOrganization: Reference?

    /**
     * Health insurance provider network in which the participatingOrganization
     * provides the role's services (if defined) at the indicated locations (if
     * defined).
     */
    val network: kotlin.collections.List<Reference>?

    /**
     * Definition of the role the participatingOrganization plays.
     */
    val code: kotlin.collections.List<CodeableConcept>?

    /**
     * Specific specialty of the participatingOrganization in the context of the role.
     */
    val specialty: kotlin.collections.List<CodeableConcept>?

    /**
     * The location(s) at which the role occurs.
     */
    val location: kotlin.collections.List<Reference>?

    /**
     * Healthcare services provided through the role.
     */
    val healthcareService: kotlin.collections.List<Reference>?

    /**
     * Contact details at the participatingOrganization relevant to this Affiliation.
     */
    val telecom: kotlin.collections.List<ContactPoint>?

    /**
     * Technical endpoints providing access to services operated for this role.
     */
    val endpoint: kotlin.collections.List<Reference>?
}

/**
 * OrganizationAffiliation
 *
 * Defines an affiliation/assotiation/relationship between 2 distinct oganizations, that is not a part-
 * of relationship/sub-division relationship
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/OrganizationAffiliation">OrganizationAffiliation</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/OrganizationAffiliation)
 */
@Serializable
@SerialName("OrganizationAffiliation")
data class OrganizationAffiliation(

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("active")
    override val active: Bool? = null,

    @SerialName("period")
    override val period: Period? = null,

    @SerialName("organization")
    override val organization: Reference? = null,

    @SerialName("participatingOrganization")
    override val participatingOrganization: Reference? = null,

    @SerialName("network")
    override val network: kotlin.collections.List<Reference>? = null,

    @SerialName("code")
    override val code: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("specialty")
    override val specialty: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("location")
    override val location: kotlin.collections.List<Reference>? = null,

    @SerialName("healthcareService")
    override val healthcareService: kotlin.collections.List<Reference>? = null,

    @SerialName("telecom")
    override val telecom: kotlin.collections.List<ContactPoint>? = null,

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
) : FhirOrganizationAffiliation {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "OrganizationAffiliation"
    }
}
