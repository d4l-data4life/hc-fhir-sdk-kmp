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
 * FhirEnrollmentRequest
 *
 * This resource provides the insurance enrollment details to the insurer regarding a specified
 * coverage.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/EnrollmentRequest">EnrollmentRequest</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/EnrollmentRequest)
 */
interface FhirEnrollmentRequest : FhirDomainResource {

    /**
     * Business Identifier.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * active | cancelled | draft | entered-in-error.
     */
    val status: String?

    /**
     * Creation date.
     */
    val created: DateTime?

    /**
     * Target.
     */
    val insurer: Reference?

    /**
     * Responsible practitioner.
     */
    val provider: Reference?

    /**
     * Responsible organization.
     */
    val organization: Reference?

    /**
     * The subject of the Products and Services.
     */
    val subject: Reference?

    /**
     * Insurance information.
     */
    val coverage: Reference?
}

/**
 * EnrollmentRequest
 *
 * This resource provides the insurance enrollment details to the insurer regarding a specified
 * coverage.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/EnrollmentRequest">EnrollmentRequest</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/EnrollmentRequest)
 */
@Serializable
@SerialName("EnrollmentRequest")
data class EnrollmentRequest(

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("status")
    override val status: String? = null,

    @SerialName("created")
    override val created: DateTime? = null,

    @SerialName("insurer")
    override val insurer: Reference? = null,

    @SerialName("provider")
    override val provider: Reference? = null,

    @SerialName("organization")
    override val organization: Reference? = null,

    @SerialName("subject")
    override val subject: Reference? = null,

    @SerialName("coverage")
    override val coverage: Reference? = null,

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
) : FhirEnrollmentRequest {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "EnrollmentRequest"
    }
}
