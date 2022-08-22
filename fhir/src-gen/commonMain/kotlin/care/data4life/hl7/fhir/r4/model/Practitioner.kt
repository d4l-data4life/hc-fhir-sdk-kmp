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
import care.data4life.hl7.fhir.r4.primitive.Bool
import care.data4life.hl7.fhir.r4.primitive.Date
import kotlin.jvm.JvmStatic
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * FhirPractitioner
 *
 * A person who is directly or indirectly involved in the provisioning of healthcare.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Practitioner">Practitioner</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Practitioner)
 */
interface FhirPractitioner : FhirDomainResource {

    /**
     * An identifier for the person as this agent.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * Whether this practitioner's record is in active use.
     */
    val active: Bool?

    /**
     * The name(s) associated with the practitioner.
     */
    val name: kotlin.collections.List<HumanName>?

    /**
     * A contact detail for the practitioner (that apply to all roles).
     */
    val telecom: kotlin.collections.List<ContactPoint>?

    /**
     * Address(es) of the practitioner that are not role specific (typically home
     * address).
     */
    val address: kotlin.collections.List<Address>?

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
    val photo: kotlin.collections.List<Attachment>?

    /**
     * Certification, licenses, or training pertaining to the provision of care.
     */
    val qualification: kotlin.collections.List<PractitionerQualification>?

    /**
     * A language the practitioner can use in patient communication.
     */
    val communication: kotlin.collections.List<CodeableConcept>?
}

/**
 * Practitioner
 *
 * A person who is directly or indirectly involved in the provisioning of healthcare.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Practitioner">Practitioner</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Practitioner)
 */
@Serializable
@SerialName("Practitioner")
data class Practitioner(

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("active")
    override val active: Bool? = null,

    @SerialName("name")
    override val name: kotlin.collections.List<HumanName>? = null,

    @SerialName("telecom")
    override val telecom: kotlin.collections.List<ContactPoint>? = null,

    @SerialName("address")
    override val address: kotlin.collections.List<Address>? = null,

    @SerialName("gender")
    override val gender: AdministrativeGender? = null,

    @SerialName("birthDate")
    override val birthDate: Date? = null,

    @SerialName("photo")
    override val photo: kotlin.collections.List<Attachment>? = null,

    @SerialName("qualification")
    override val qualification: kotlin.collections.List<PractitionerQualification>? = null,

    @SerialName("communication")
    override val communication: kotlin.collections.List<CodeableConcept>? = null,

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
) : FhirPractitioner {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "Practitioner"
    }
}

/**
 * FhirPractitionerQualification
 *
 * The official certifications, training, and licenses that authorize or otherwise pertain to the
 * provision of care by the practitioner. For example, a medical license issued by a medical board
 * authorizing the practitioner to practice medicine within a certian locality.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Practitioner">PractitionerQualification</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Practitioner)
 */
interface FhirPractitionerQualification : FhirBackboneElement {

    /**
     * An identifier for this qualification for the practitioner.
     */
    val identifier: kotlin.collections.List<Identifier>?

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
 * The official certifications, training, and licenses that authorize or otherwise pertain to the
 * provision of care by the practitioner. For example, a medical license issued by a medical board
 * authorizing the practitioner to practice medicine within a certian locality.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Practitioner">PractitionerQualification</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Practitioner)
 */
@Serializable
@SerialName("PractitionerQualification")
data class PractitionerQualification(

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("code")
    override val code: CodeableConcept,

    @SerialName("period")
    override val period: Period? = null,

    @SerialName("issuer")
    override val issuer: Reference? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirPractitionerQualification {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "PractitionerQualification"
    }
}
