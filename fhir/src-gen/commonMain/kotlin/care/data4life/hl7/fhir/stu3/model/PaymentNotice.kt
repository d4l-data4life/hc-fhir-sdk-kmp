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
 * FhirPaymentNotice
 *
 * This resource provides the status of the payment for goods and services rendered, and the request
 * and response resource references.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/PaymentNotice">PaymentNotice</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/PaymentNotice)
 */
interface FhirPaymentNotice : FhirDomainResource {

    /**
     * Business Identifier.
     */
    val identifier: List<Identifier>?

    /**
     * active | cancelled | draft | entered-in-error.
     */
    val status: String?

    /**
     * Request reference.
     */
    val request: Reference?

    /**
     * Response reference.
     */
    val response: Reference?

    /**
     * Payment or clearing date.
     */
    val statusDate: Date?

    /**
     * Creation date.
     */
    val created: DateTime?

    /**
     * Insurer or Regulatory body.
     */
    val target: Reference?

    /**
     * Responsible practitioner.
     */
    val provider: Reference?

    /**
     * Responsible organization.
     */
    val organization: Reference?

    /**
     * Whether payment has been sent or cleared.
     */
    val paymentStatus: CodeableConcept?
}

/**
 * PaymentNotice
 *
 * SourceFileName: PaymentNotice.kt
 *
 * This resource provides the status of the payment for goods and services rendered, and the request
 * and response resource references.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/PaymentNotice">PaymentNotice</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/PaymentNotice)
 */
@Serializable
@SerialName("PaymentNotice")
data class PaymentNotice(

    @SerialName("identifier")
    override val identifier: List<Identifier>? = null,

    @SerialName("status")
    override val status: String? = null,

    @SerialName("request")
    override val request: Reference? = null,

    @SerialName("response")
    override val response: Reference? = null,

    @SerialName("statusDate")
    override val statusDate: Date? = null,

    @SerialName("created")
    override val created: DateTime? = null,

    @SerialName("target")
    override val target: Reference? = null,

    @SerialName("provider")
    override val provider: Reference? = null,

    @SerialName("organization")
    override val organization: Reference? = null,

    @SerialName("paymentStatus")
    override val paymentStatus: CodeableConcept? = null,

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
) : FhirPaymentNotice {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "PaymentNotice"
    }
}
