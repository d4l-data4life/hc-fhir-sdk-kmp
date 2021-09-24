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

import care.data4life.hl7.fhir.r4.codesystem.FinancialResourceStatusCodes
import care.data4life.hl7.fhir.r4.primitive.Date
import care.data4life.hl7.fhir.r4.primitive.DateTime
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
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/PaymentNotice)
 */
interface FhirPaymentNotice : FhirDomainResource {

    /**
     * Business Identifier for the payment noctice.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * The status of the resource instance.
     */
    val status: FinancialResourceStatusCodes

    /**
     * Request reference.
     */
    val request: Reference?

    /**
     * Response reference.
     */
    val response: Reference?

    /**
     * Creation date.
     */
    val created: DateTime

    /**
     * Responsible practitioner.
     */
    val provider: Reference?

    /**
     * Payment reference.
     */
    val payment: Reference

    /**
     * Payment or clearing date.
     */
    val paymentDate: Date?

    /**
     * Party being paid.
     */
    val payee: Reference?

    /**
     * Party being notified.
     */
    val recipient: Reference

    /**
     * Monetary amount of the payment.
     */
    val amount: Money

    /**
     * Issued or cleared Status of the payment.
     */
    val paymentStatus: CodeableConcept?
}

/**
 * PaymentNotice
 *
 * This resource provides the status of the payment for goods and services rendered, and the request
 * and response resource references.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/PaymentNotice">PaymentNotice</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/PaymentNotice)
 */
@Serializable
@SerialName("PaymentNotice")
data class PaymentNotice(

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("status")
    override val status: FinancialResourceStatusCodes,

    @SerialName("request")
    override val request: Reference? = null,

    @SerialName("response")
    override val response: Reference? = null,

    @SerialName("created")
    override val created: DateTime,

    @SerialName("provider")
    override val provider: Reference? = null,

    @SerialName("payment")
    override val payment: Reference,

    @SerialName("paymentDate")
    override val paymentDate: Date? = null,

    @SerialName("payee")
    override val payee: Reference? = null,

    @SerialName("recipient")
    override val recipient: Reference,

    @SerialName("amount")
    override val amount: Money,

    @SerialName("paymentStatus")
    override val paymentStatus: CodeableConcept? = null,

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
) : FhirPaymentNotice {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "PaymentNotice"
    }
}
