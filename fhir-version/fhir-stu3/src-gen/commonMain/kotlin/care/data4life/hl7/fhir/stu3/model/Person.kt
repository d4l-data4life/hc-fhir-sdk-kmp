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

import care.data4life.hl7.fhir.stu3.codesystem.AdministrativeGender
import care.data4life.hl7.fhir.stu3.codesystem.IdentityAssuranceLevel
import care.data4life.hl7.fhir.stu3.primitive.Bool
import care.data4life.hl7.fhir.stu3.primitive.Date
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirPerson
 *
 * Demographics and administrative information about a person independent of a specific health-related
 * context.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Person">Person</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Person)
 */
interface FhirPerson : FhirDomainResource {

    /**
     * A human identifier for this person.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * A name associated with the person.
     */
    val name: kotlin.collections.List<HumanName>?

    /**
     * A contact detail for the person.
     */
    val telecom: kotlin.collections.List<ContactPoint>?

    /**
     * Administrative Gender.
     */
    val gender: AdministrativeGender?

    /**
     * The date on which the person was born.
     */
    val birthDate: Date?

    /**
     * One or more addresses for the person.
     */
    val address: kotlin.collections.List<Address>?

    /**
     * Image of the person.
     */
    val photo: Attachment?

    /**
     * The organization that is the custodian of the person record.
     */
    val managingOrganization: Reference?

    /**
     * This person's record is in active use.
     */
    val active: Bool?

    /**
     * Link to a resource that concerns the same actual person.
     */
    val link: kotlin.collections.List<PersonLink>?
}

/**
 * Person
 *
 * Demographics and administrative information about a person independent of a specific health-related
 * context.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Person">Person</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Person)
 */
@Serializable
@SerialName("Person")
data class Person(

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("name")
    override val name: kotlin.collections.List<HumanName>? = null,

    @SerialName("telecom")
    override val telecom: kotlin.collections.List<ContactPoint>? = null,

    @SerialName("gender")
    override val gender: AdministrativeGender? = null,

    @SerialName("birthDate")
    override val birthDate: Date? = null,

    @SerialName("address")
    override val address: kotlin.collections.List<Address>? = null,

    @SerialName("photo")
    override val photo: Attachment? = null,

    @SerialName("managingOrganization")
    override val managingOrganization: Reference? = null,

    @SerialName("active")
    override val active: Bool? = null,

    @SerialName("link")
    override val link: kotlin.collections.List<PersonLink>? = null,

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
) : FhirPerson {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "Person"
    }
}

/**
 * FhirPersonLink
 *
 * Link to a resource that concerns the same actual person
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Person">PersonLink</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Person)
 */
interface FhirPersonLink : FhirBackboneElement {

    /**
     * The resource to which this actual person is associated.
     */
    val target: Reference

    /**
     * Level of assurance that this link is actually associated with the target
     * resource.
     */
    val assurance: IdentityAssuranceLevel?
}

/**
 * PersonLink
 *
 * Link to a resource that concerns the same actual person
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Person">PersonLink</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Person)
 */
@Serializable
@SerialName("PersonLink")
data class PersonLink(

    @SerialName("target")
    override val target: Reference,

    @SerialName("assurance")
    override val assurance: IdentityAssuranceLevel? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirPersonLink {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "PersonLink"
    }
}
