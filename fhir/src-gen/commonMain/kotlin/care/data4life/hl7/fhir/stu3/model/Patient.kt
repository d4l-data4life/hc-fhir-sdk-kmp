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
import care.data4life.hl7.fhir.stu3.codesystem.LinkType
import care.data4life.hl7.fhir.stu3.primitive.Bool
import care.data4life.hl7.fhir.stu3.primitive.Date
import care.data4life.hl7.fhir.stu3.primitive.DateTime
import care.data4life.hl7.fhir.stu3.primitive.Integer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirPatient
 *
 * Demographics and other administrative information about an individual or animal receiving care or
 * other health-related services.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Patient">Patient</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Patient)
 */
interface FhirPatient : FhirDomainResource {

    /**
     * An identifier for this patient.
     */
    val identifier: List<Identifier>?

    /**
     * Whether this patient's record is in active use.
     */
    val active: Bool?

    /**
     * A name associated with the patient.
     */
    val name: List<HumanName>?

    /**
     * A contact detail for the individual.
     */
    val telecom: List<ContactPoint>?

    /**
     * Administrative Gender - the gender that the patient is considered to have for
     * administration and record keeping purposes.
     */
    val gender: AdministrativeGender?

    /**
     * The date of birth for the individual.
     */
    val birthDate: Date?

    /**
     * Indicates if the individual is deceased or not.
     */
    val deceasedBoolean: Bool?

    /**
     * Indicates if the individual is deceased or not.
     */
    val deceasedDateTime: DateTime?

    /**
     * Addresses for the individual.
     */
    val address: List<Address>?

    /**
     * Marital (civil) status of a patient.
     */
    val maritalStatus: CodeableConcept?

    /**
     * Whether patient is part of a multiple birth.
     */
    val multipleBirthBoolean: Bool?

    /**
     * Whether patient is part of a multiple birth.
     */
    val multipleBirthInteger: Integer?

    /**
     * Image of the patient.
     */
    val photo: List<Attachment>?

    /**
     * A contact party (e.g. guardian, partner, friend) for the patient.
     */
    val contact: List<PatientContact>?

    /**
     * This patient is known to be an animal (non-human).
     */
    val animal: PatientAnimal?

    /**
     * A list of Languages which may be used to communicate with the patient about his
     * or her health.
     */
    val communication: List<PatientCommunication>?

    /**
     * Patient's nominated primary care provider.
     */
    val generalPractitioner: List<Reference>?

    /**
     * Organization that is the custodian of the patient record.
     */
    val managingOrganization: Reference?

    /**
     * Link to another patient resource that concerns the same actual person.
     */
    val link: List<PatientLink>?
}

/**
 * Patient
 *
 * SourceFileName: Patient.kt
 *
 * Demographics and other administrative information about an individual or animal receiving care or
 * other health-related services.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Patient">Patient</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Patient)
 */
@Serializable
@SerialName("Patient")
data class Patient(

    @SerialName("identifier")
    override val identifier: List<Identifier>? = null,

    @SerialName("active")
    override val active: Bool? = null,

    @SerialName("name")
    override val name: List<HumanName>? = null,

    @SerialName("telecom")
    override val telecom: List<ContactPoint>? = null,

    @SerialName("gender")
    override val gender: AdministrativeGender? = null,

    @SerialName("birthDate")
    override val birthDate: Date? = null,

    @SerialName("deceasedBoolean")
    override val deceasedBoolean: Bool? = null,

    @SerialName("deceasedDateTime")
    override val deceasedDateTime: DateTime? = null,

    @SerialName("address")
    override val address: List<Address>? = null,

    @SerialName("maritalStatus")
    override val maritalStatus: CodeableConcept? = null,

    @SerialName("multipleBirthBoolean")
    override val multipleBirthBoolean: Bool? = null,

    @SerialName("multipleBirthInteger")
    override val multipleBirthInteger: Integer? = null,

    @SerialName("photo")
    override val photo: List<Attachment>? = null,

    @SerialName("contact")
    override val contact: List<PatientContact>? = null,

    @SerialName("animal")
    override val animal: PatientAnimal? = null,

    @SerialName("communication")
    override val communication: List<PatientCommunication>? = null,

    @SerialName("generalPractitioner")
    override val generalPractitioner: List<Reference>? = null,

    @SerialName("managingOrganization")
    override val managingOrganization: Reference? = null,

    @SerialName("link")
    override val link: List<PatientLink>? = null,

    // # DomainResource@SerialName("text")
    override val text: Narrative? = null,
    @SerialName("contained")
    override val contained: List<FhirResource>? = null,
    @SerialName("extension")
    override val extension: List<Extension>? = null,
    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Resource@SerialName("id")
    override val id: String? = null,
    @SerialName("meta")
    override val meta: Meta? = null,
    @SerialName("implicitRules")
    override val implicitRules: String? = null,
    @SerialName("language")
    override val language: String? = null
) : FhirPatient {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "Patient"
    }
}

/**
 * FhirPatientAnimal
 *
 * This patient is known to be an animal.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Patient">PatientAnimal</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Patient)
 */
interface FhirPatientAnimal : FhirBackboneElement {

    /**
     * E.g. Dog, Cow.
     */
    val species: CodeableConcept

    /**
     * E.g. Poodle, Angus.
     */
    val breed: CodeableConcept?

    /**
     * E.g. Neutered, Intact.
     */
    val genderStatus: CodeableConcept?
}

/**
 * PatientAnimal
 *
 * SourceFileName: Patient.kt
 *
 * This patient is known to be an animal.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Patient">PatientAnimal</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Patient)
 */
@Serializable
@SerialName("PatientAnimal")
data class PatientAnimal(

    @SerialName("species")
    override val species: CodeableConcept,

    @SerialName("breed")
    override val breed: CodeableConcept? = null,

    @SerialName("genderStatus")
    override val genderStatus: CodeableConcept? = null,

    // # BackboneElement@SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element@SerialName("id")
    override val id: String? = null,
    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirPatientAnimal {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "PatientAnimal"
    }
}

/**
 * FhirPatientCommunication
 *
 * Languages which may be used to communicate with the patient about his or her health.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Patient">PatientCommunication</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Patient)
 */
interface FhirPatientCommunication : FhirBackboneElement {

    /**
     * The language which can be used to communicate with the patient about his or her
     * health.
     */
    val language: CodeableConcept

    /**
     * Language preference indicator.
     */
    val preferred: Bool?
}

/**
 * PatientCommunication
 *
 * SourceFileName: Patient.kt
 *
 * Languages which may be used to communicate with the patient about his or her health.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Patient">PatientCommunication</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Patient)
 */
@Serializable
@SerialName("PatientCommunication")
data class PatientCommunication(

    @SerialName("language")
    override val language: CodeableConcept,

    @SerialName("preferred")
    override val preferred: Bool? = null,

    // # BackboneElement@SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element@SerialName("id")
    override val id: String? = null,
    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirPatientCommunication {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "PatientCommunication"
    }
}

/**
 * FhirPatientContact
 *
 * A contact party (e.g. guardian, partner, friend) for the patient
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Patient">PatientContact</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Patient)
 */
interface FhirPatientContact : FhirBackboneElement {

    /**
     * The kind of relationship.
     */
    val relationship: List<CodeableConcept>?

    /**
     * A name associated with the contact person.
     */
    val name: HumanName?

    /**
     * A contact detail for the person.
     */
    val telecom: List<ContactPoint>?

    /**
     * Address for the contact person.
     */
    val address: Address?

    /**
     * Administrative Gender - the gender that the contact person is considered to have
     * for administration and record keeping purposes.
     */
    val gender: AdministrativeGender?

    /**
     * Organization that is associated with the contact.
     */
    val organization: Reference?

    /**
     * The period during which this contact person or organization is valid to be
     * contacted relating to this patient.
     */
    val period: Period?
}

/**
 * PatientContact
 *
 * SourceFileName: Patient.kt
 *
 * A contact party (e.g. guardian, partner, friend) for the patient
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Patient">PatientContact</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Patient)
 */
@Serializable
@SerialName("PatientContact")
data class PatientContact(

    @SerialName("relationship")
    override val relationship: List<CodeableConcept>? = null,

    @SerialName("name")
    override val name: HumanName? = null,

    @SerialName("telecom")
    override val telecom: List<ContactPoint>? = null,

    @SerialName("address")
    override val address: Address? = null,

    @SerialName("gender")
    override val gender: AdministrativeGender? = null,

    @SerialName("organization")
    override val organization: Reference? = null,

    @SerialName("period")
    override val period: Period? = null,

    // # BackboneElement@SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element@SerialName("id")
    override val id: String? = null,
    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirPatientContact {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "PatientContact"
    }
}

/**
 * FhirPatientLink
 *
 * Link to another patient resource that concerns the same actual patient.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Patient">PatientLink</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Patient)
 */
interface FhirPatientLink : FhirBackboneElement {

    /**
     * The other patient or related person resource that the link refers to.
     */
    val other: Reference

    /**
     * The type of link between this patient resource and another patient resource.
     */
    val type: LinkType
}

/**
 * PatientLink
 *
 * SourceFileName: Patient.kt
 *
 * Link to another patient resource that concerns the same actual patient.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Patient">PatientLink</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Patient)
 */
@Serializable
@SerialName("PatientLink")
data class PatientLink(

    @SerialName("other")
    override val other: Reference,

    @SerialName("type")
    override val type: LinkType,

    // # BackboneElement@SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element@SerialName("id")
    override val id: String? = null,
    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirPatientLink {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "PatientLink"
    }
}
