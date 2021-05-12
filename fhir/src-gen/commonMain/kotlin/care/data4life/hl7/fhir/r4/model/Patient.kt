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

import care.data4life.hl7.fhir.r4.codesystem.AdministrativeGender
import care.data4life.hl7.fhir.r4.codesystem.LinkType
import care.data4life.hl7.fhir.r4.primitive.Bool
import care.data4life.hl7.fhir.r4.primitive.Date
import care.data4life.hl7.fhir.r4.primitive.DateTime
import care.data4life.hl7.fhir.r4.primitive.Integer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

interface FhirPatient : FhirDomainResource {

    // An identifier for this patient.
    val identifier: List<Identifier>?

    // Whether this patient's record is in active use.
    val active: Bool?

    // A name associated with the patient.
    val name: List<HumanName>?

    // A contact detail for the individual.
    val telecom: List<ContactPoint>?

    // Administrative Gender - the gender that the patient is considered to have for administration and record keeping purposes.
    val gender: AdministrativeGender?

    // The date of birth for the individual.
    val birthDate: Date?

    // Indicates if the individual is deceased or not.
    val deceasedBoolean: Bool?

    // Indicates if the individual is deceased or not.
    val deceasedDateTime: DateTime?

    // An address for the individual.
    val address: List<Address>?

    // Marital (civil) status of a patient.
    val maritalStatus: CodeableConcept?

    // Whether patient is part of a multiple birth.
    val multipleBirthBoolean: Bool?

    // Whether patient is part of a multiple birth.
    val multipleBirthInteger: Integer?

    // Image of the patient.
    val photo: List<Attachment>?

    // A contact party (e.g. guardian, partner, friend) for the patient.
    val contact: List<PatientContact>?

    // A language which may be used to communicate with the patient about his or her health.
    val communication: List<PatientCommunication>?

    // Patient's nominated primary care provider.
    val generalPractitioner: List<Reference>?

    // Organization that is the custodian of the patient record.
    val managingOrganization: Reference?

    // Link to another patient resource that concerns the same actual person.
    val link: List<PatientLink>?
}

/**
 * ClassName: Patient
 *
 * SourceFileName: Patient.kt
 *
 * Demographics and other administrative information about an individual or animal receiving care or
 * other health-related services.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Patient">Patient</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Patient)
 */
@Serializable
@SerialName("Patient")
data class Patient(

    // An identifier for this patient.
    @SerialName("identifier")
    override val identifier: List<Identifier>? = null,

    // Whether this patient's record is in active use.
    @SerialName("active")
    override val active: Bool? = null,

    // A name associated with the patient.
    @SerialName("name")
    override val name: List<HumanName>? = null,

    // A contact detail for the individual.
    @SerialName("telecom")
    override val telecom: List<ContactPoint>? = null,

    // Administrative Gender - the gender that the patient is considered to have for administration and record keeping purposes.
    @SerialName("gender")
    override val gender: AdministrativeGender? = null,

    // The date of birth for the individual.
    @SerialName("birthDate")
    override val birthDate: Date? = null,

    // Indicates if the individual is deceased or not.
    @SerialName("deceasedBoolean")
    override val deceasedBoolean: Bool? = null,

    // Indicates if the individual is deceased or not.
    @SerialName("deceasedDateTime")
    override val deceasedDateTime: DateTime? = null,

    // An address for the individual.
    @SerialName("address")
    override val address: List<Address>? = null,

    // Marital (civil) status of a patient.
    @SerialName("maritalStatus")
    override val maritalStatus: CodeableConcept? = null,

    // Whether patient is part of a multiple birth.
    @SerialName("multipleBirthBoolean")
    override val multipleBirthBoolean: Bool? = null,

    // Whether patient is part of a multiple birth.
    @SerialName("multipleBirthInteger")
    override val multipleBirthInteger: Integer? = null,

    // Image of the patient.
    @SerialName("photo")
    override val photo: List<Attachment>? = null,

    // A contact party (e.g. guardian, partner, friend) for the patient.
    @SerialName("contact")
    override val contact: List<PatientContact>? = null,

    // A language which may be used to communicate with the patient about his or her health.
    @SerialName("communication")
    override val communication: List<PatientCommunication>? = null,

    // Patient's nominated primary care provider.
    @SerialName("generalPractitioner")
    override val generalPractitioner: List<Reference>? = null,

    // Organization that is the custodian of the patient record.
    @SerialName("managingOrganization")
    override val managingOrganization: Reference? = null,

    // Link to another patient resource that concerns the same actual person.
    @SerialName("link")
    override val link: List<PatientLink>? = null,

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
) : FhirPatient {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "Patient"
    }
}

interface FhirPatientCommunication : FhirBackboneElement {

    // The language which can be used to communicate with the patient about his or her health.
    val language: CodeableConcept

    // Language preference indicator.
    val preferred: Bool?
}

/**
 * ClassName: PatientCommunication
 *
 * SourceFileName: Patient.kt
 *
 * A language which may be used to communicate with the patient about his or her health
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Patient">PatientCommunication</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Patient)
 */
@Serializable
@SerialName("PatientCommunication")
data class PatientCommunication(

    // The language which can be used to communicate with the patient about his or her health.
    @SerialName("language")
    override val language: CodeableConcept,

    // Language preference indicator.
    @SerialName("preferred")
    override val preferred: Bool? = null,

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
) : FhirPatientCommunication {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "PatientCommunication"
    }
}

interface FhirPatientContact : FhirBackboneElement {

    // The kind of relationship.
    val relationship: List<CodeableConcept>?

    // A name associated with the contact person.
    val name: HumanName?

    // A contact detail for the person.
    val telecom: List<ContactPoint>?

    // Address for the contact person.
    val address: Address?

    // Administrative Gender - the gender that the contact person is considered to have for administration and record keeping purposes.
    val gender: AdministrativeGender?

    // Organization that is associated with the contact.
    val organization: Reference?

    // The period during which this contact person or organization is valid to be contacted relating to this patient.
    val period: Period?
}

/**
 * ClassName: PatientContact
 *
 * SourceFileName: Patient.kt
 *
 * A contact party (e.g. guardian, partner, friend) for the patient
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Patient">PatientContact</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Patient)
 */
@Serializable
@SerialName("PatientContact")
data class PatientContact(

    // The kind of relationship.
    @SerialName("relationship")
    override val relationship: List<CodeableConcept>? = null,

    // A name associated with the contact person.
    @SerialName("name")
    override val name: HumanName? = null,

    // A contact detail for the person.
    @SerialName("telecom")
    override val telecom: List<ContactPoint>? = null,

    // Address for the contact person.
    @SerialName("address")
    override val address: Address? = null,

    // Administrative Gender - the gender that the contact person is considered to have for administration and record keeping purposes.
    @SerialName("gender")
    override val gender: AdministrativeGender? = null,

    // Organization that is associated with the contact.
    @SerialName("organization")
    override val organization: Reference? = null,

    // The period during which this contact person or organization is valid to be contacted relating to this patient.
    @SerialName("period")
    override val period: Period? = null,

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
) : FhirPatientContact {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "PatientContact"
    }
}

interface FhirPatientLink : FhirBackboneElement {

    // The other patient or related person resource that the link refers to.
    val other: Reference

    // The type of link between this patient resource and another patient resource.
    val type: LinkType
}

/**
 * ClassName: PatientLink
 *
 * SourceFileName: Patient.kt
 *
 * Link to another patient resource that concerns the same actual patient.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Patient">PatientLink</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Patient)
 */
@Serializable
@SerialName("PatientLink")
data class PatientLink(

    // The other patient or related person resource that the link refers to.
    @SerialName("other")
    override val other: Reference,

    // The type of link between this patient resource and another patient resource.
    @SerialName("type")
    override val type: LinkType,

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
) : FhirPatientLink {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "PatientLink"
    }
}
