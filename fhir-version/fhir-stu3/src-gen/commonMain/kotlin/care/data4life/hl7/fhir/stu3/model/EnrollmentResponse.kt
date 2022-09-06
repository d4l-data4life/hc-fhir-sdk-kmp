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

import care.data4life.hl7.fhir.stu3.primitive.DateTime
import kotlin.jvm.JvmStatic
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * FhirEnrollmentResponse
 *
 * This resource provides enrollment and plan details from the processing of an Enrollment resource.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/EnrollmentResponse">EnrollmentResponse</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/EnrollmentResponse)
 */
interface FhirEnrollmentResponse : FhirDomainResource {

    /**
     * Business Identifier.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * active | cancelled | draft | entered-in-error.
     */
    val status: String?

    /**
     * Claim reference.
     */
    val request: Reference?

    /**
     * complete | error | partial.
     */
    val outcome: CodeableConcept?

    /**
     * Disposition Message.
     */
    val disposition: String?

    /**
     * Creation date.
     */
    val created: DateTime?

    /**
     * Insurer.
     */
    val organization: Reference?

    /**
     * Responsible practitioner.
     */
    val requestProvider: Reference?

    /**
     * Responsible organization.
     */
    val requestOrganization: Reference?
}

/**
 * EnrollmentResponse
 *
 * This resource provides enrollment and plan details from the processing of an Enrollment resource.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/EnrollmentResponse">EnrollmentResponse</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/EnrollmentResponse)
 */
@Serializable
@SerialName("EnrollmentResponse")
data class EnrollmentResponse(

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("status")
    override val status: String? = null,

    @SerialName("request")
    override val request: Reference? = null,

    @SerialName("outcome")
    override val outcome: CodeableConcept? = null,

    @SerialName("disposition")
    override val disposition: String? = null,

    @SerialName("created")
    override val created: DateTime? = null,

    @SerialName("organization")
    override val organization: Reference? = null,

    @SerialName("requestProvider")
    override val requestProvider: Reference? = null,

    @SerialName("requestOrganization")
    override val requestOrganization: Reference? = null,

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
) : FhirEnrollmentResponse {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "EnrollmentResponse"
    }
}
