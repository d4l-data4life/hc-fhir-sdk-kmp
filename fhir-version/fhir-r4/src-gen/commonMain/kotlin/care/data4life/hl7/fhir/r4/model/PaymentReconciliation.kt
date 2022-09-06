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

import care.data4life.hl7.fhir.r4.codesystem.ClaimProcessingCodes
import care.data4life.hl7.fhir.r4.codesystem.FinancialResourceStatusCodes
import care.data4life.hl7.fhir.r4.codesystem.NoteType
import care.data4life.hl7.fhir.r4.primitive.Date
import care.data4life.hl7.fhir.r4.primitive.DateTime
import kotlin.jvm.JvmStatic
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * FhirPaymentReconciliation
 *
 * This resource provides the details including amount of a payment and allocates the payment items
 * being paid.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/PaymentReconciliation">PaymentReconciliation</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/PaymentReconciliation)
 */
interface FhirPaymentReconciliation : FhirDomainResource {

    /**
     * Business Identifier for a payment reconciliation.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * The status of the resource instance.
     */
    val status: FinancialResourceStatusCodes

    /**
     * Period covered.
     */
    val period: Period?

    /**
     * Creation date.
     */
    val created: DateTime

    /**
     * Party generating payment.
     */
    val paymentIssuer: Reference?

    /**
     * Reference to requesting resource.
     */
    val request: Reference?

    /**
     * Responsible practitioner.
     */
    val requestor: Reference?

    /**
     * The outcome of a request for a reconciliation.
     */
    val outcome: ClaimProcessingCodes?

    /**
     * Disposition message.
     */
    val disposition: String?

    /**
     * When payment issued.
     */
    val paymentDate: Date

    /**
     * Total amount of Payment.
     */
    val paymentAmount: Money

    /**
     * Business identifier for the payment.
     */
    val paymentIdentifier: Identifier?

    /**
     * Settlement particulars.
     */
    val detail: kotlin.collections.List<PaymentReconciliationDetail>?

    /**
     * Printed form identifier.
     */
    val formCode: CodeableConcept?

    /**
     * Note concerning processing.
     */
    val processNote: kotlin.collections.List<PaymentReconciliationProcessNote>?
}

/**
 * PaymentReconciliation
 *
 * This resource provides the details including amount of a payment and allocates the payment items
 * being paid.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/PaymentReconciliation">PaymentReconciliation</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/PaymentReconciliation)
 */
@Serializable
@SerialName("PaymentReconciliation")
data class PaymentReconciliation(

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("status")
    override val status: FinancialResourceStatusCodes,

    @SerialName("period")
    override val period: Period? = null,

    @SerialName("created")
    override val created: DateTime,

    @SerialName("paymentIssuer")
    override val paymentIssuer: Reference? = null,

    @SerialName("request")
    override val request: Reference? = null,

    @SerialName("requestor")
    override val requestor: Reference? = null,

    @SerialName("outcome")
    override val outcome: ClaimProcessingCodes? = null,

    @SerialName("disposition")
    override val disposition: String? = null,

    @SerialName("paymentDate")
    override val paymentDate: Date,

    @SerialName("paymentAmount")
    override val paymentAmount: Money,

    @SerialName("paymentIdentifier")
    override val paymentIdentifier: Identifier? = null,

    @SerialName("detail")
    override val detail: kotlin.collections.List<PaymentReconciliationDetail>? = null,

    @SerialName("formCode")
    override val formCode: CodeableConcept? = null,

    @SerialName("processNote")
    override val processNote: kotlin.collections.List<PaymentReconciliationProcessNote>? = null,

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
) : FhirPaymentReconciliation {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "PaymentReconciliation"
    }
}

/**
 * FhirPaymentReconciliationDetail
 *
 * Distribution of the payment amount for a previously acknowledged payable.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/PaymentReconciliation">PaymentReconciliationDetail</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/PaymentReconciliation)
 */
interface FhirPaymentReconciliationDetail : FhirBackboneElement {

    /**
     * Business identifier of the payment detail.
     */
    val identifier: Identifier?

    /**
     * Business identifier of the prior payment detail.
     */
    val predecessor: Identifier?

    /**
     * Category of payment.
     */
    val type: CodeableConcept

    /**
     * Request giving rise to the payment.
     */
    val request: Reference?

    /**
     * Submitter of the request.
     */
    val submitter: Reference?

    /**
     * Response committing to a payment.
     */
    val response: Reference?

    /**
     * Date of commitment to pay.
     */
    val date: Date?

    /**
     * Contact for the response.
     */
    val responsible: Reference?

    /**
     * Recipient of the payment.
     */
    val payee: Reference?

    /**
     * Amount allocated to this payable.
     */
    val amount: Money?
}

/**
 * PaymentReconciliationDetail
 *
 * Distribution of the payment amount for a previously acknowledged payable.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/PaymentReconciliation">PaymentReconciliationDetail</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/PaymentReconciliation)
 */
@Serializable
@SerialName("PaymentReconciliationDetail")
data class PaymentReconciliationDetail(

    @SerialName("identifier")
    override val identifier: Identifier? = null,

    @SerialName("predecessor")
    override val predecessor: Identifier? = null,

    @SerialName("type")
    override val type: CodeableConcept,

    @SerialName("request")
    override val request: Reference? = null,

    @SerialName("submitter")
    override val submitter: Reference? = null,

    @SerialName("response")
    override val response: Reference? = null,

    @SerialName("date")
    override val date: Date? = null,

    @SerialName("responsible")
    override val responsible: Reference? = null,

    @SerialName("payee")
    override val payee: Reference? = null,

    @SerialName("amount")
    override val amount: Money? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirPaymentReconciliationDetail {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "PaymentReconciliationDetail"
    }
}

/**
 * FhirPaymentReconciliationProcessNote
 *
 * A note that describes or explains the processing in a human readable form.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/PaymentReconciliation">PaymentReconciliationProcessNote</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/PaymentReconciliation)
 */
interface FhirPaymentReconciliationProcessNote : FhirBackboneElement {

    /**
     * The business purpose of the note text.
     */
    val type: NoteType?

    /**
     * Note explanatory text.
     */
    val text: String?
}

/**
 * PaymentReconciliationProcessNote
 *
 * A note that describes or explains the processing in a human readable form.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/PaymentReconciliation">PaymentReconciliationProcessNote</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/PaymentReconciliation)
 */
@Serializable
@SerialName("PaymentReconciliationProcessNote")
data class PaymentReconciliationProcessNote(

    @SerialName("type")
    override val type: NoteType? = null,

    @SerialName("text")
    override val text: String? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirPaymentReconciliationProcessNote {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "PaymentReconciliationProcessNote"
    }
}
