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

import care.data4life.hl7.fhir.stu3.primitive.Date
import care.data4life.hl7.fhir.stu3.primitive.DateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirEligibilityRequest
 *
 * The EligibilityRequest provides patient and insurance coverage information to an insurer for them to
 * respond, in the form of an EligibilityResponse, with information regarding whether the stated
 * coverage is valid and in-force and optionally to provide the insurance details of the policy.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/EligibilityRequest">EligibilityRequest</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/EligibilityRequest)
 */
interface FhirEligibilityRequest : FhirDomainResource {

    /**
     * Business Identifier.
     */
    val identifier: List<Identifier>?

    /**
     * active | cancelled | draft | entered-in-error.
     */
    val status: String?

    /**
     * Desired processing priority.
     */
    val priority: CodeableConcept?

    /**
     * The subject of the Products and Services.
     */
    val patient: Reference?

    /**
     * Estimated date or dates of Service.
     */
    val servicedDate: Date?

    /**
     * Estimated date or dates of Service.
     */
    val servicedPeriod: Period?

    /**
     * Creation date.
     */
    val created: DateTime?

    /**
     * Author.
     */
    val enterer: Reference?

    /**
     * Responsible practitioner.
     */
    val provider: Reference?

    /**
     * Responsible organization.
     */
    val organization: Reference?

    /**
     * Target.
     */
    val insurer: Reference?

    /**
     * Servicing Facility.
     */
    val facility: Reference?

    /**
     * Insurance or medical plan.
     */
    val coverage: Reference?

    /**
     * Business agreement.
     */
    val businessArrangement: String?

    /**
     * Type of services covered.
     */
    val benefitCategory: CodeableConcept?

    /**
     * Detailed services covered within the type.
     */
    val benefitSubCategory: CodeableConcept?
}

/**
 * EligibilityRequest
 *
 * SourceFileName: EligibilityRequest.kt
 *
 * The EligibilityRequest provides patient and insurance coverage information to an insurer for them to
 * respond, in the form of an EligibilityResponse, with information regarding whether the stated
 * coverage is valid and in-force and optionally to provide the insurance details of the policy.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/EligibilityRequest">EligibilityRequest</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/EligibilityRequest)
 */
@Serializable
@SerialName("EligibilityRequest")
data class EligibilityRequest(

    @SerialName("identifier")
    override val identifier: List<Identifier>? = null,

    @SerialName("status")
    override val status: String? = null,

    @SerialName("priority")
    override val priority: CodeableConcept? = null,

    @SerialName("patient")
    override val patient: Reference? = null,

    @SerialName("servicedDate")
    override val servicedDate: Date? = null,

    @SerialName("servicedPeriod")
    override val servicedPeriod: Period? = null,

    @SerialName("created")
    override val created: DateTime? = null,

    @SerialName("enterer")
    override val enterer: Reference? = null,

    @SerialName("provider")
    override val provider: Reference? = null,

    @SerialName("organization")
    override val organization: Reference? = null,

    @SerialName("insurer")
    override val insurer: Reference? = null,

    @SerialName("facility")
    override val facility: Reference? = null,

    @SerialName("coverage")
    override val coverage: Reference? = null,

    @SerialName("businessArrangement")
    override val businessArrangement: String? = null,

    @SerialName("benefitCategory")
    override val benefitCategory: CodeableConcept? = null,

    @SerialName("benefitSubCategory")
    override val benefitSubCategory: CodeableConcept? = null,

    // # DomainResource

    @SerialName("text")
    override val text: Narrative? = null,

    @SerialName("contained")
    override val contained: List<FhirResource>? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null,

    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Resource

    @SerialName("id")
    override val id: String? = null,

    @SerialName("meta")
    override val meta: Meta? = null,

    @SerialName("implicitRules")
    override val implicitRules: String? = null,

    @SerialName("language")
    override val language: String? = null
) : FhirEligibilityRequest {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "EligibilityRequest"
    }
}
