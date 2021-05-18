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
 * FhirPractitioner
 *
 * A person who is directly or indirectly involved in the provisioning of healthcare.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Practitioner">Practitioner</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Practitioner)
 */
interface FhirPractitioner : FhirDomainResource {

    /**
     * A identifier for the person as this agent.
     */
    val identifier: List<Identifier>?

    /**
     * Whether this practitioner's record is in active use.
     */
    val active: Bool?

    /**
     * The name(s) associated with the practitioner.
     */
    val name: List<HumanName>?

    /**
     * A contact detail for the practitioner (that apply to all roles).
     */
    val telecom: List<ContactPoint>?

    /**
     * Address(es) of the practitioner that are not role specific (typically home
     * address).
     */
    val address: List<Address>?

    /**
     * Administrative Gender - the gender that the person is considered to have for
     * administration and record keeping purposes.
     */
    val gender: AdministrativeGender?

    /**
     * The date on which the practitioner was born.
     */
    val birthDate: Date?

    /**
     * Image of the person.
     */
    val photo: List<Attachment>?

    /**
     * Qualifications obtained by training and certification.
     */
    val qualification: List<PractitionerQualification>?

    /**
     * A language the practitioner is able to use in patient communication.
     */
    val communication: List<CodeableConcept>?
}

/**
 * Practitioner
 *
 * SourceFileName: Practitioner.kt
 *
 * A person who is directly or indirectly involved in the provisioning of healthcare.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Practitioner">Practitioner</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Practitioner)
 */
@Serializable
@SerialName("Practitioner")
data class Practitioner(

    @SerialName("identifier")
    override val identifier: List<Identifier>? = null,

    @SerialName("active")
    override val active: Bool? = null,

    @SerialName("name")
    override val name: List<HumanName>? = null,

    @SerialName("telecom")
    override val telecom: List<ContactPoint>? = null,

    @SerialName("address")
    override val address: List<Address>? = null,

    @SerialName("gender")
    override val gender: AdministrativeGender? = null,

    @SerialName("birthDate")
    override val birthDate: Date? = null,

    @SerialName("photo")
    override val photo: List<Attachment>? = null,

    @SerialName("qualification")
    override val qualification: List<PractitionerQualification>? = null,

    @SerialName("communication")
    override val communication: List<CodeableConcept>? = null,

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
) : FhirPractitioner {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "Practitioner"
    }
}

/**
 * FhirPractitionerQualification
 *
 * Qualifications obtained by training and certification
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Practitioner">PractitionerQualification</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Practitioner)
 */
interface FhirPractitionerQualification : FhirBackboneElement {

    /**
     * An identifier for this qualification for the practitioner.
     */
    val identifier: List<Identifier>?

    /**
     * Coded representation of the qualification.
     */
    val code: CodeableConcept

    /**
     * Period during which the qualification is valid.
     */
    val period: Period?

    /**
     * Organization that regulates and issues the qualification.
     */
    val issuer: Reference?
}

/**
 * PractitionerQualification
 *
 * SourceFileName: Practitioner.kt
 *
 * Qualifications obtained by training and certification
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Practitioner">PractitionerQualification</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Practitioner)
 */
@Serializable
@SerialName("PractitionerQualification")
data class PractitionerQualification(

    @SerialName("identifier")
    override val identifier: List<Identifier>? = null,

    @SerialName("code")
    override val code: CodeableConcept,

    @SerialName("period")
    override val period: Period? = null,

    @SerialName("issuer")
    override val issuer: Reference? = null,

    // # BackboneElement@SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element@SerialName("id")
    override val id: String? = null,
    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirPractitionerQualification {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "PractitionerQualification"
    }
}
