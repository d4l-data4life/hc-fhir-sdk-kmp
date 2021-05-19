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
 * FhirPaymentReconciliation
 *
 * This resource provides payment details and claim references supporting a bulk payment.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/PaymentReconciliation">PaymentReconciliation</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/PaymentReconciliation)
 */
interface FhirPaymentReconciliation : FhirDomainResource {

    /**
     * Business Identifier.
     */
    val identifier: List<Identifier>?

    /**
     * active | cancelled | draft | entered-in-error.
     */
    val status: String?

    /**
     * Period covered.
     */
    val period: Period?

    /**
     * Creation date.
     */
    val created: DateTime?

    /**
     * Insurer.
     */
    val organization: Reference?

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
     * Responsible practitioner.
     */
    val requestProvider: Reference?

    /**
     * Responsible organization.
     */
    val requestOrganization: Reference?

    /**
     * List of settlements.
     */
    val detail: List<PaymentReconciliationDetail>?

    /**
     * Printed Form Identifier.
     */
    val form: CodeableConcept?

    /**
     * Total amount of Payment.
     */
    val total: Money?

    /**
     * Processing comments.
     */
    val processNote: List<PaymentReconciliationProcessNote>?
}

/**
 * PaymentReconciliation
 *
 * SourceFileName: PaymentReconciliation.kt
 *
 * This resource provides payment details and claim references supporting a bulk payment.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/PaymentReconciliation">PaymentReconciliation</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/PaymentReconciliation)
 */
@Serializable
@SerialName("PaymentReconciliation")
data class PaymentReconciliation(

    @SerialName("identifier")
    override val identifier: List<Identifier>? = null,

    @SerialName("status")
    override val status: String? = null,

    @SerialName("period")
    override val period: Period? = null,

    @SerialName("created")
    override val created: DateTime? = null,

    @SerialName("organization")
    override val organization: Reference? = null,

    @SerialName("request")
    override val request: Reference? = null,

    @SerialName("outcome")
    override val outcome: CodeableConcept? = null,

    @SerialName("disposition")
    override val disposition: String? = null,

    @SerialName("requestProvider")
    override val requestProvider: Reference? = null,

    @SerialName("requestOrganization")
    override val requestOrganization: Reference? = null,

    @SerialName("detail")
    override val detail: List<PaymentReconciliationDetail>? = null,

    @SerialName("form")
    override val form: CodeableConcept? = null,

    @SerialName("total")
    override val total: Money? = null,

    @SerialName("processNote")
    override val processNote: List<PaymentReconciliationProcessNote>? = null,

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
) : FhirPaymentReconciliation {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "PaymentReconciliation"
    }
}

/**
 * FhirPaymentReconciliationDetail
 *
 * List of individual settlement amounts and the corresponding transaction.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/PaymentReconciliation">PaymentReconciliationDetail</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/PaymentReconciliation)
 */
interface FhirPaymentReconciliationDetail : FhirBackboneElement {

    /**
     * Type code.
     */
    val type: CodeableConcept

    /**
     * Claim.
     */
    val request: Reference?

    /**
     * Claim Response.
     */
    val response: Reference?

    /**
     * Organization which submitted the claim.
     */
    val submitter: Reference?

    /**
     * Organization which is receiving the payment.
     */
    val payee: Reference?

    /**
     * Invoice date.
     */
    val date: Date?

    /**
     * Amount being paid.
     */
    val amount: Money?
}

/**
 * PaymentReconciliationDetail
 *
 * SourceFileName: PaymentReconciliation.kt
 *
 * List of individual settlement amounts and the corresponding transaction.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/PaymentReconciliation">PaymentReconciliationDetail</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/PaymentReconciliation)
 */
@Serializable
@SerialName("PaymentReconciliationDetail")
data class PaymentReconciliationDetail(

    @SerialName("type")
    override val type: CodeableConcept,

    @SerialName("request")
    override val request: Reference? = null,

    @SerialName("response")
    override val response: Reference? = null,

    @SerialName("submitter")
    override val submitter: Reference? = null,

    @SerialName("payee")
    override val payee: Reference? = null,

    @SerialName("date")
    override val date: Date? = null,

    @SerialName("amount")
    override val amount: Money? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirPaymentReconciliationDetail {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "PaymentReconciliationDetail"
    }
}

/**
 * FhirPaymentReconciliationProcessNote
 *
 * Suite of notes.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/PaymentReconciliation">PaymentReconciliationProcessNote</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/PaymentReconciliation)
 */
interface FhirPaymentReconciliationProcessNote : FhirBackboneElement {

    /**
     * display | print | printoper.
     */
    val type: CodeableConcept?

    /**
     * Comment on the processing.
     */
    val text: String?
}

/**
 * PaymentReconciliationProcessNote
 *
 * SourceFileName: PaymentReconciliation.kt
 *
 * Suite of notes.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/PaymentReconciliation">PaymentReconciliationProcessNote</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/PaymentReconciliation)
 */
@Serializable
@SerialName("PaymentReconciliationProcessNote")
data class PaymentReconciliationProcessNote(

    @SerialName("type")
    override val type: CodeableConcept? = null,

    @SerialName("text")
    override val text: String? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirPaymentReconciliationProcessNote {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "PaymentReconciliationProcessNote"
    }
}
