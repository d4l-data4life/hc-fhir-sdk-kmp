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

import care.data4life.hl7.fhir.r4.codesystem.InvoicePriceComponentType
import care.data4life.hl7.fhir.r4.codesystem.InvoiceStatus
import care.data4life.hl7.fhir.r4.primitive.DateTime
import care.data4life.hl7.fhir.r4.primitive.Decimal
import care.data4life.hl7.fhir.r4.primitive.PositiveInteger
import kotlin.jvm.JvmStatic
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * FhirInvoice
 *
 * Invoice containing collected ChargeItems from an Account with calculated individual and total price
 * for Billing purpose.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Invoice">Invoice</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Invoice)
 */
interface FhirInvoice : FhirDomainResource {

    /**
     * Business Identifier for item.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * The current state of the Invoice.
     */
    val status: InvoiceStatus

    /**
     * Reason for cancellation of this Invoice.
     */
    val cancelledReason: String?

    /**
     * Type of Invoice.
     */
    val type: CodeableConcept?

    /**
     * Recipient(s) of goods and services.
     */
    val subject: Reference?

    /**
     * Recipient of this invoice.
     */
    val recipient: Reference?

    /**
     * Invoice date / posting date.
     */
    val date: DateTime?

    /**
     * Participant in creation of this Invoice.
     */
    val participant: kotlin.collections.List<InvoiceParticipant>?

    /**
     * Issuing Organization of Invoice.
     */
    val issuer: Reference?

    /**
     * Account that is being balanced.
     */
    val account: Reference?

    /**
     * Line items of this Invoice.
     */
    val lineItem: kotlin.collections.List<InvoiceLineItem>?

    /**
     * Components of Invoice total.
     */
    val totalPriceComponent: kotlin.collections.List<InvoiceLineItemPriceComponent>?

    /**
     * Net total of this Invoice.
     */
    val totalNet: Money?

    /**
     * Gross total of this Invoice.
     */
    val totalGross: Money?

    /**
     * Payment details.
     */
    val paymentTerms: String?

    /**
     * Comments made about the invoice.
     */
    val note: kotlin.collections.List<Annotation>?
}

/**
 * Invoice
 *
 * Invoice containing collected ChargeItems from an Account with calculated individual and total price
 * for Billing purpose.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Invoice">Invoice</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Invoice)
 */
@Serializable
@SerialName("Invoice")
data class Invoice(

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("status")
    override val status: InvoiceStatus,

    @SerialName("cancelledReason")
    override val cancelledReason: String? = null,

    @SerialName("type")
    override val type: CodeableConcept? = null,

    @SerialName("subject")
    override val subject: Reference? = null,

    @SerialName("recipient")
    override val recipient: Reference? = null,

    @SerialName("date")
    override val date: DateTime? = null,

    @SerialName("participant")
    override val participant: kotlin.collections.List<InvoiceParticipant>? = null,

    @SerialName("issuer")
    override val issuer: Reference? = null,

    @SerialName("account")
    override val account: Reference? = null,

    @SerialName("lineItem")
    override val lineItem: kotlin.collections.List<InvoiceLineItem>? = null,

    @SerialName("totalPriceComponent")
    override val totalPriceComponent: kotlin.collections.List<InvoiceLineItemPriceComponent>? = null,

    @SerialName("totalNet")
    override val totalNet: Money? = null,

    @SerialName("totalGross")
    override val totalGross: Money? = null,

    @SerialName("paymentTerms")
    override val paymentTerms: String? = null,

    @SerialName("note")
    override val note: kotlin.collections.List<Annotation>? = null,

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
) : FhirInvoice {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "Invoice"
    }
}

/**
 * FhirInvoiceLineItem
 *
 * Each line item represents one charge for goods and services rendered. Details such as date, code and
 * amount are found in the referenced ChargeItem resource.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Invoice">InvoiceLineItem</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Invoice)
 */
interface FhirInvoiceLineItem : FhirBackboneElement {

    /**
     * Sequence number of line item.
     */
    val sequence: PositiveInteger?

    /**
     * Reference to ChargeItem containing details of this line item or an inline
     * billing code.
     */
    val chargeItemReference: Reference?

    /**
     * Reference to ChargeItem containing details of this line item or an inline
     * billing code.
     */
    val chargeItemCodeableConcept: CodeableConcept?

    /**
     * Components of total line item price.
     */
    val priceComponent: kotlin.collections.List<InvoiceLineItemPriceComponent>?
}

/**
 * InvoiceLineItem
 *
 * Each line item represents one charge for goods and services rendered. Details such as date, code and
 * amount are found in the referenced ChargeItem resource.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Invoice">InvoiceLineItem</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Invoice)
 */
@Serializable
@SerialName("InvoiceLineItem")
data class InvoiceLineItem(

    @SerialName("sequence")
    override val sequence: PositiveInteger? = null,

    @SerialName("chargeItemReference")
    override val chargeItemReference: Reference? = null,

    @SerialName("chargeItemCodeableConcept")
    override val chargeItemCodeableConcept: CodeableConcept? = null,

    @SerialName("priceComponent")
    override val priceComponent: kotlin.collections.List<InvoiceLineItemPriceComponent>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirInvoiceLineItem {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "InvoiceLineItem"
    }
}

/**
 * FhirInvoiceLineItemPriceComponent
 *
 * The price for a ChargeItem may be calculated as a base price with surcharges/deductions that apply
 * in certain conditions. A ChargeItemDefinition resource that defines the prices, factors and
 * conditions that apply to a billing code is currently under development. The priceComponent element
 * can be used to offer transparency to the recipient of the Invoice as to how the prices have been
 * calculated.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Invoice">InvoiceLineItemPriceComponent</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Invoice)
 */
interface FhirInvoiceLineItemPriceComponent : FhirBackboneElement {

    /**
     * This code identifies the type of the component.
     */
    val type: InvoicePriceComponentType

    /**
     * Code identifying the specific component.
     */
    val code: CodeableConcept?

    /**
     * Factor used for calculating this component.
     */
    val factor: Decimal?

    /**
     * Monetary amount associated with this component.
     */
    val amount: Money?
}

/**
 * InvoiceLineItemPriceComponent
 *
 * The price for a ChargeItem may be calculated as a base price with surcharges/deductions that apply
 * in certain conditions. A ChargeItemDefinition resource that defines the prices, factors and
 * conditions that apply to a billing code is currently under development. The priceComponent element
 * can be used to offer transparency to the recipient of the Invoice as to how the prices have been
 * calculated.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Invoice">InvoiceLineItemPriceComponent</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Invoice)
 */
@Serializable
@SerialName("InvoiceLineItemPriceComponent")
data class InvoiceLineItemPriceComponent(

    @SerialName("type")
    override val type: InvoicePriceComponentType,

    @SerialName("code")
    override val code: CodeableConcept? = null,

    @SerialName("factor")
    override val factor: Decimal? = null,

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
) : FhirInvoiceLineItemPriceComponent {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "InvoiceLineItemPriceComponent"
    }
}

/**
 * FhirInvoiceParticipant
 *
 * Indicates who or what performed or participated in the charged service.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Invoice">InvoiceParticipant</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Invoice)
 */
interface FhirInvoiceParticipant : FhirBackboneElement {

    /**
     * Type of involvement in creation of this Invoice.
     */
    val role: CodeableConcept?

    /**
     * Individual who was involved.
     */
    val actor: Reference
}

/**
 * InvoiceParticipant
 *
 * Indicates who or what performed or participated in the charged service.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Invoice">InvoiceParticipant</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Invoice)
 */
@Serializable
@SerialName("InvoiceParticipant")
data class InvoiceParticipant(

    @SerialName("role")
    override val role: CodeableConcept? = null,

    @SerialName("actor")
    override val actor: Reference,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirInvoiceParticipant {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "InvoiceParticipant"
    }
}
