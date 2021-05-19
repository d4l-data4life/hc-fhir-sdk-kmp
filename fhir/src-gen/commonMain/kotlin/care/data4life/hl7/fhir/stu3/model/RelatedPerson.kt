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
import care.data4life.hl7.fhir.stu3.primitive.Bool
import care.data4life.hl7.fhir.stu3.primitive.Date
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirRelatedPerson
 *
 * Information about a person that is involved in the care for a patient, but who is not the target of
 * healthcare, nor has a formal responsibility in the care process.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/RelatedPerson">RelatedPerson</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/RelatedPerson)
 */
interface FhirRelatedPerson : FhirDomainResource {

    /**
     * A human identifier for this person.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * Whether this related person's record is in active use.
     */
    val active: Bool?

    /**
     * The patient this person is related to.
     */
    val patient: Reference

    /**
     * The nature of the relationship.
     */
    val relationship: CodeableConcept?

    /**
     * A name associated with the person.
     */
    val name: kotlin.collections.List<HumanName>?

    /**
     * A contact detail for the person.
     */
    val telecom: kotlin.collections.List<ContactPoint>?

    /**
     * Administrative Gender - the gender that the person is considered to have for
     * administration and record keeping purposes.
     */
    val gender: AdministrativeGender?

    /**
     * The date on which the related person was born.
     */
    val birthDate: Date?

    /**
     * Address where the related person can be contacted or visited.
     */
    val address: kotlin.collections.List<Address>?

    /**
     * Image of the person.
     */
    val photo: kotlin.collections.List<Attachment>?

    /**
     * Period of time that this relationship is considered valid.
     */
    val period: Period?
}

/**
 * RelatedPerson
 *
 * Information about a person that is involved in the care for a patient, but who is not the target of
 * healthcare, nor has a formal responsibility in the care process.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/RelatedPerson">RelatedPerson</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/RelatedPerson)
 */
@Serializable
@SerialName("RelatedPerson")
data class RelatedPerson(

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("active")
    override val active: Bool? = null,

    @SerialName("patient")
    override val patient: Reference,

    @SerialName("relationship")
    override val relationship: CodeableConcept? = null,

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
    override val photo: kotlin.collections.List<Attachment>? = null,

    @SerialName("period")
    override val period: Period? = null,

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
) : FhirRelatedPerson {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "RelatedPerson"
    }
}
