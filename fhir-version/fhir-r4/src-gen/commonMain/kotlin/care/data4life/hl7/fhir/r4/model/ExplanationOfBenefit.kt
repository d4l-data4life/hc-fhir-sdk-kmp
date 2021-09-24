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
import care.data4life.hl7.fhir.r4.codesystem.ExplanationOfBenefitStatus
import care.data4life.hl7.fhir.r4.codesystem.NoteType
import care.data4life.hl7.fhir.r4.codesystem.Use
import care.data4life.hl7.fhir.r4.primitive.Bool
import care.data4life.hl7.fhir.r4.primitive.Date
import care.data4life.hl7.fhir.r4.primitive.DateTime
import care.data4life.hl7.fhir.r4.primitive.Decimal
import care.data4life.hl7.fhir.r4.primitive.PositiveInteger
import care.data4life.hl7.fhir.r4.primitive.UnsignedInteger
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirExplanationOfBenefit
 *
 * This resource provides: the claim details; adjudication details from the processing of a Claim; and
 * optionally account balance information, for informing the subscriber of the benefits provided.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit">ExplanationOfBenefit</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit)
 */
interface FhirExplanationOfBenefit : FhirDomainResource {

    /**
     * Business Identifier for the resource.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * The status of the resource instance.
     */
    val status: ExplanationOfBenefitStatus

    /**
     * Category or discipline.
     */
    val type: CodeableConcept

    /**
     * More granular claim type.
     */
    val subType: CodeableConcept?

    /**
     * A code to indicate whether the nature of the request is: to request adjudication
     * of products and services previously rendered; or requesting authorization and
     * adjudication for provision in the future; or requesting the non-binding
     * adjudication of the listed products and services which could be provided in the
     * future.
     */
    val use: Use

    /**
     * The recipient of the products and services.
     */
    val patient: Reference

    /**
     * Relevant time frame for the claim.
     */
    val billablePeriod: Period?

    /**
     * Response creation date.
     */
    val created: DateTime

    /**
     * Author of the claim.
     */
    val enterer: Reference?

    /**
     * Party responsible for reimbursement.
     */
    val insurer: Reference

    /**
     * Party responsible for the claim.
     */
    val provider: Reference

    /**
     * Desired processing urgency.
     */
    val priority: CodeableConcept?

    /**
     * For whom to reserve funds.
     */
    val fundsReserveRequested: CodeableConcept?

    /**
     * Funds reserved status.
     */
    val fundsReserve: CodeableConcept?

    /**
     * Prior or corollary claims.
     */
    val related: kotlin.collections.List<ExplanationOfBenefitRelated>?

    /**
     * Prescription authorizing services or products.
     */
    val prescription: Reference?

    /**
     * Original prescription if superceded by fulfiller.
     */
    val originalPrescription: Reference?

    /**
     * Recipient of benefits payable.
     */
    val payee: ExplanationOfBenefitPayee?

    /**
     * Treatment Referral.
     */
    val referral: Reference?

    /**
     * Servicing Facility.
     */
    val facility: Reference?

    /**
     * Claim reference.
     */
    val claim: Reference?

    /**
     * Claim response reference.
     */
    val claimResponse: Reference?

    /**
     * The outcome of the claim, predetermination, or preauthorization processing.
     */
    val outcome: ClaimProcessingCodes

    /**
     * Disposition Message.
     */
    val disposition: String?

    /**
     * Preauthorization reference.
     */
    val preAuthRef: kotlin.collections.List<String>?

    /**
     * Preauthorization in-effect period.
     */
    val preAuthRefPeriod: kotlin.collections.List<Period>?

    /**
     * Care Team members.
     */
    val careTeam: kotlin.collections.List<ExplanationOfBenefitCareTeam>?

    /**
     * Supporting information.
     */
    val supportingInfo: kotlin.collections.List<ExplanationOfBenefitSupportingInfo>?

    /**
     * Pertinent diagnosis information.
     */
    val diagnosis: kotlin.collections.List<ExplanationOfBenefitDiagnosis>?

    /**
     * Clinical procedures performed.
     */
    val procedure: kotlin.collections.List<ExplanationOfBenefitProcedure>?

    /**
     * Precedence (primary, secondary, etc.).
     */
    val precedence: PositiveInteger?

    /**
     * Patient insurance information.
     */
    val insurance: kotlin.collections.List<ExplanationOfBenefitInsurance>

    /**
     * Details of the event.
     */
    val accident: ExplanationOfBenefitAccident?

    /**
     * Product or service provided.
     */
    val item: kotlin.collections.List<ExplanationOfBenefitItem>?

    /**
     * Insurer added line items.
     */
    val addItem: kotlin.collections.List<ExplanationOfBenefitAddItem>?

    /**
     * Header-level adjudication.
     */
    val adjudication: kotlin.collections.List<ExplanationOfBenefitItemAdjudication>?

    /**
     * Adjudication totals.
     */
    val total: kotlin.collections.List<ExplanationOfBenefitTotal>?

    /**
     * Payment Details.
     */
    val payment: ExplanationOfBenefitPayment?

    /**
     * Printed form identifier.
     */
    val formCode: CodeableConcept?

    /**
     * Printed reference or actual form.
     */
    val form: Attachment?

    /**
     * Note concerning adjudication.
     */
    val processNote: kotlin.collections.List<ExplanationOfBenefitProcessNote>?

    /**
     * When the benefits are applicable.
     */
    val benefitPeriod: Period?

    /**
     * Balance by Benefit Category.
     */
    val benefitBalance: kotlin.collections.List<ExplanationOfBenefitBenefitBalance>?
}

/**
 * ExplanationOfBenefit
 *
 * This resource provides: the claim details; adjudication details from the processing of a Claim; and
 * optionally account balance information, for informing the subscriber of the benefits provided.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit">ExplanationOfBenefit</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit)
 */
@Serializable
@SerialName("ExplanationOfBenefit")
data class ExplanationOfBenefit(

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("status")
    override val status: ExplanationOfBenefitStatus,

    @SerialName("type")
    override val type: CodeableConcept,

    @SerialName("subType")
    override val subType: CodeableConcept? = null,

    @SerialName("use")
    override val use: Use,

    @SerialName("patient")
    override val patient: Reference,

    @SerialName("billablePeriod")
    override val billablePeriod: Period? = null,

    @SerialName("created")
    override val created: DateTime,

    @SerialName("enterer")
    override val enterer: Reference? = null,

    @SerialName("insurer")
    override val insurer: Reference,

    @SerialName("provider")
    override val provider: Reference,

    @SerialName("priority")
    override val priority: CodeableConcept? = null,

    @SerialName("fundsReserveRequested")
    override val fundsReserveRequested: CodeableConcept? = null,

    @SerialName("fundsReserve")
    override val fundsReserve: CodeableConcept? = null,

    @SerialName("related")
    override val related: kotlin.collections.List<ExplanationOfBenefitRelated>? = null,

    @SerialName("prescription")
    override val prescription: Reference? = null,

    @SerialName("originalPrescription")
    override val originalPrescription: Reference? = null,

    @SerialName("payee")
    override val payee: ExplanationOfBenefitPayee? = null,

    @SerialName("referral")
    override val referral: Reference? = null,

    @SerialName("facility")
    override val facility: Reference? = null,

    @SerialName("claim")
    override val claim: Reference? = null,

    @SerialName("claimResponse")
    override val claimResponse: Reference? = null,

    @SerialName("outcome")
    override val outcome: ClaimProcessingCodes,

    @SerialName("disposition")
    override val disposition: String? = null,

    @SerialName("preAuthRef")
    override val preAuthRef: kotlin.collections.List<String>? = null,

    @SerialName("preAuthRefPeriod")
    override val preAuthRefPeriod: kotlin.collections.List<Period>? = null,

    @SerialName("careTeam")
    override val careTeam: kotlin.collections.List<ExplanationOfBenefitCareTeam>? = null,

    @SerialName("supportingInfo")
    override val supportingInfo: kotlin.collections.List<ExplanationOfBenefitSupportingInfo>? = null,

    @SerialName("diagnosis")
    override val diagnosis: kotlin.collections.List<ExplanationOfBenefitDiagnosis>? = null,

    @SerialName("procedure")
    override val procedure: kotlin.collections.List<ExplanationOfBenefitProcedure>? = null,

    @SerialName("precedence")
    override val precedence: PositiveInteger? = null,

    @SerialName("insurance")
    override val insurance: kotlin.collections.List<ExplanationOfBenefitInsurance>,

    @SerialName("accident")
    override val accident: ExplanationOfBenefitAccident? = null,

    @SerialName("item")
    override val item: kotlin.collections.List<ExplanationOfBenefitItem>? = null,

    @SerialName("addItem")
    override val addItem: kotlin.collections.List<ExplanationOfBenefitAddItem>? = null,

    @SerialName("adjudication")
    override val adjudication: kotlin.collections.List<ExplanationOfBenefitItemAdjudication>? = null,

    @SerialName("total")
    override val total: kotlin.collections.List<ExplanationOfBenefitTotal>? = null,

    @SerialName("payment")
    override val payment: ExplanationOfBenefitPayment? = null,

    @SerialName("formCode")
    override val formCode: CodeableConcept? = null,

    @SerialName("form")
    override val form: Attachment? = null,

    @SerialName("processNote")
    override val processNote: kotlin.collections.List<ExplanationOfBenefitProcessNote>? = null,

    @SerialName("benefitPeriod")
    override val benefitPeriod: Period? = null,

    @SerialName("benefitBalance")
    override val benefitBalance: kotlin.collections.List<ExplanationOfBenefitBenefitBalance>? = null,

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
) : FhirExplanationOfBenefit {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ExplanationOfBenefit"
    }
}

/**
 * FhirExplanationOfBenefitAccident
 *
 * Details of a accident which resulted in injuries which required the products and services listed in
 * the claim.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit">ExplanationOfBenefitAccident</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit)
 */
interface FhirExplanationOfBenefitAccident : FhirBackboneElement {

    /**
     * When the incident occurred.
     */
    val date: Date?

    /**
     * The nature of the accident.
     */
    val type: CodeableConcept?

    /**
     * Where the event occurred.
     */
    val locationAddress: Address?

    /**
     * Where the event occurred.
     */
    val locationReference: Reference?
}

/**
 * ExplanationOfBenefitAccident
 *
 * Details of a accident which resulted in injuries which required the products and services listed in
 * the claim.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit">ExplanationOfBenefitAccident</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit)
 */
@Serializable
@SerialName("ExplanationOfBenefitAccident")
data class ExplanationOfBenefitAccident(

    @SerialName("date")
    override val date: Date? = null,

    @SerialName("type")
    override val type: CodeableConcept? = null,

    @SerialName("locationAddress")
    override val locationAddress: Address? = null,

    @SerialName("locationReference")
    override val locationReference: Reference? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirExplanationOfBenefitAccident {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ExplanationOfBenefitAccident"
    }
}

/**
 * FhirExplanationOfBenefitAddItem
 *
 * The first-tier service adjudications for payor added product or service lines.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit">ExplanationOfBenefitAddItem</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit)
 */
interface FhirExplanationOfBenefitAddItem : FhirBackboneElement {

    /**
     * Item sequence number.
     */
    val itemSequence: kotlin.collections.List<PositiveInteger>?

    /**
     * Detail sequence number.
     */
    val detailSequence: kotlin.collections.List<PositiveInteger>?

    /**
     * Subdetail sequence number.
     */
    val subDetailSequence: kotlin.collections.List<PositiveInteger>?

    /**
     * Authorized providers.
     */
    val provider: kotlin.collections.List<Reference>?

    /**
     * Billing, service, product, or drug code.
     */
    val productOrService: CodeableConcept

    /**
     * Service/Product billing modifiers.
     */
    val modifier: kotlin.collections.List<CodeableConcept>?

    /**
     * Program the product or service is provided under.
     */
    val programCode: kotlin.collections.List<CodeableConcept>?

    /**
     * Date or dates of service or product delivery.
     */
    val servicedDate: Date?

    /**
     * Date or dates of service or product delivery.
     */
    val servicedPeriod: Period?

    /**
     * Place of service or where product was supplied.
     */
    val locationCodeableConcept: CodeableConcept?

    /**
     * Place of service or where product was supplied.
     */
    val locationAddress: Address?

    /**
     * Place of service or where product was supplied.
     */
    val locationReference: Reference?

    /**
     * Count of products or services.
     */
    val quantity: Quantity?

    /**
     * Fee, charge or cost per item.
     */
    val unitPrice: Money?

    /**
     * Price scaling factor.
     */
    val factor: Decimal?

    /**
     * Total item cost.
     */
    val net: Money?

    /**
     * Anatomical location.
     */
    val bodySite: CodeableConcept?

    /**
     * Anatomical sub-location.
     */
    val subSite: kotlin.collections.List<CodeableConcept>?

    /**
     * Applicable note numbers.
     */
    val noteNumber: kotlin.collections.List<PositiveInteger>?

    /**
     * Added items adjudication.
     */
    val adjudication: kotlin.collections.List<ExplanationOfBenefitItemAdjudication>?

    /**
     * Insurer added line items.
     */
    val detail: kotlin.collections.List<ExplanationOfBenefitAddItemDetail>?
}

/**
 * ExplanationOfBenefitAddItem
 *
 * The first-tier service adjudications for payor added product or service lines.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit">ExplanationOfBenefitAddItem</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit)
 */
@Serializable
@SerialName("ExplanationOfBenefitAddItem")
data class ExplanationOfBenefitAddItem(

    @SerialName("itemSequence")
    override val itemSequence: kotlin.collections.List<PositiveInteger>? = null,

    @SerialName("detailSequence")
    override val detailSequence: kotlin.collections.List<PositiveInteger>? = null,

    @SerialName("subDetailSequence")
    override val subDetailSequence: kotlin.collections.List<PositiveInteger>? = null,

    @SerialName("provider")
    override val provider: kotlin.collections.List<Reference>? = null,

    @SerialName("productOrService")
    override val productOrService: CodeableConcept,

    @SerialName("modifier")
    override val modifier: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("programCode")
    override val programCode: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("servicedDate")
    override val servicedDate: Date? = null,

    @SerialName("servicedPeriod")
    override val servicedPeriod: Period? = null,

    @SerialName("locationCodeableConcept")
    override val locationCodeableConcept: CodeableConcept? = null,

    @SerialName("locationAddress")
    override val locationAddress: Address? = null,

    @SerialName("locationReference")
    override val locationReference: Reference? = null,

    @SerialName("quantity")
    override val quantity: Quantity? = null,

    @SerialName("unitPrice")
    override val unitPrice: Money? = null,

    @SerialName("factor")
    override val factor: Decimal? = null,

    @SerialName("net")
    override val net: Money? = null,

    @SerialName("bodySite")
    override val bodySite: CodeableConcept? = null,

    @SerialName("subSite")
    override val subSite: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("noteNumber")
    override val noteNumber: kotlin.collections.List<PositiveInteger>? = null,

    @SerialName("adjudication")
    override val adjudication: kotlin.collections.List<ExplanationOfBenefitItemAdjudication>? = null,

    @SerialName("detail")
    override val detail: kotlin.collections.List<ExplanationOfBenefitAddItemDetail>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirExplanationOfBenefitAddItem {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ExplanationOfBenefitAddItem"
    }
}

/**
 * FhirExplanationOfBenefitAddItemDetail
 *
 * The second-tier service adjudications for payor added services.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit">ExplanationOfBenefitAddItemDetail</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit)
 */
interface FhirExplanationOfBenefitAddItemDetail : FhirBackboneElement {

    /**
     * Billing, service, product, or drug code.
     */
    val productOrService: CodeableConcept

    /**
     * Service/Product billing modifiers.
     */
    val modifier: kotlin.collections.List<CodeableConcept>?

    /**
     * Count of products or services.
     */
    val quantity: Quantity?

    /**
     * Fee, charge or cost per item.
     */
    val unitPrice: Money?

    /**
     * Price scaling factor.
     */
    val factor: Decimal?

    /**
     * Total item cost.
     */
    val net: Money?

    /**
     * Applicable note numbers.
     */
    val noteNumber: kotlin.collections.List<PositiveInteger>?

    /**
     * Added items adjudication.
     */
    val adjudication: kotlin.collections.List<ExplanationOfBenefitItemAdjudication>?

    /**
     * Insurer added line items.
     */
    val subDetail: kotlin.collections.List<ExplanationOfBenefitAddItemDetailSubDetail>?
}

/**
 * ExplanationOfBenefitAddItemDetail
 *
 * The second-tier service adjudications for payor added services.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit">ExplanationOfBenefitAddItemDetail</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit)
 */
@Serializable
@SerialName("ExplanationOfBenefitAddItemDetail")
data class ExplanationOfBenefitAddItemDetail(

    @SerialName("productOrService")
    override val productOrService: CodeableConcept,

    @SerialName("modifier")
    override val modifier: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("quantity")
    override val quantity: Quantity? = null,

    @SerialName("unitPrice")
    override val unitPrice: Money? = null,

    @SerialName("factor")
    override val factor: Decimal? = null,

    @SerialName("net")
    override val net: Money? = null,

    @SerialName("noteNumber")
    override val noteNumber: kotlin.collections.List<PositiveInteger>? = null,

    @SerialName("adjudication")
    override val adjudication: kotlin.collections.List<ExplanationOfBenefitItemAdjudication>? = null,

    @SerialName("subDetail")
    override val subDetail: kotlin.collections.List<ExplanationOfBenefitAddItemDetailSubDetail>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirExplanationOfBenefitAddItemDetail {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ExplanationOfBenefitAddItemDetail"
    }
}

/**
 * FhirExplanationOfBenefitAddItemDetailSubDetail
 *
 * The third-tier service adjudications for payor added services.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit">ExplanationOfBenefitAddItemDetailSubDetail</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit)
 */
interface FhirExplanationOfBenefitAddItemDetailSubDetail : FhirBackboneElement {

    /**
     * Billing, service, product, or drug code.
     */
    val productOrService: CodeableConcept

    /**
     * Service/Product billing modifiers.
     */
    val modifier: kotlin.collections.List<CodeableConcept>?

    /**
     * Count of products or services.
     */
    val quantity: Quantity?

    /**
     * Fee, charge or cost per item.
     */
    val unitPrice: Money?

    /**
     * Price scaling factor.
     */
    val factor: Decimal?

    /**
     * Total item cost.
     */
    val net: Money?

    /**
     * Applicable note numbers.
     */
    val noteNumber: kotlin.collections.List<PositiveInteger>?

    /**
     * Added items adjudication.
     */
    val adjudication: kotlin.collections.List<ExplanationOfBenefitItemAdjudication>?
}

/**
 * ExplanationOfBenefitAddItemDetailSubDetail
 *
 * The third-tier service adjudications for payor added services.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit">ExplanationOfBenefitAddItemDetailSubDetail</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit)
 */
@Serializable
@SerialName("ExplanationOfBenefitAddItemDetailSubDetail")
data class ExplanationOfBenefitAddItemDetailSubDetail(

    @SerialName("productOrService")
    override val productOrService: CodeableConcept,

    @SerialName("modifier")
    override val modifier: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("quantity")
    override val quantity: Quantity? = null,

    @SerialName("unitPrice")
    override val unitPrice: Money? = null,

    @SerialName("factor")
    override val factor: Decimal? = null,

    @SerialName("net")
    override val net: Money? = null,

    @SerialName("noteNumber")
    override val noteNumber: kotlin.collections.List<PositiveInteger>? = null,

    @SerialName("adjudication")
    override val adjudication: kotlin.collections.List<ExplanationOfBenefitItemAdjudication>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirExplanationOfBenefitAddItemDetailSubDetail {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ExplanationOfBenefitAddItemDetailSubDetail"
    }
}

/**
 * FhirExplanationOfBenefitBenefitBalance
 *
 * Balance by Benefit Category
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit">ExplanationOfBenefitBenefitBalance</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit)
 */
interface FhirExplanationOfBenefitBenefitBalance : FhirBackboneElement {

    /**
     * Benefit classification.
     */
    val category: CodeableConcept

    /**
     * Excluded from the plan.
     */
    val excluded: Bool?

    /**
     * Short name for the benefit.
     */
    val name: String?

    /**
     * Description of the benefit or services covered.
     */
    val description: String?

    /**
     * In or out of network.
     */
    val network: CodeableConcept?

    /**
     * Individual or family.
     */
    val unit: CodeableConcept?

    /**
     * Annual or lifetime.
     */
    val term: CodeableConcept?

    /**
     * Benefit Summary.
     */
    val financial: kotlin.collections.List<ExplanationOfBenefitBenefitBalanceFinancial>?
}

/**
 * ExplanationOfBenefitBenefitBalance
 *
 * Balance by Benefit Category
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit">ExplanationOfBenefitBenefitBalance</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit)
 */
@Serializable
@SerialName("ExplanationOfBenefitBenefitBalance")
data class ExplanationOfBenefitBenefitBalance(

    @SerialName("category")
    override val category: CodeableConcept,

    @SerialName("excluded")
    override val excluded: Bool? = null,

    @SerialName("name")
    override val name: String? = null,

    @SerialName("description")
    override val description: String? = null,

    @SerialName("network")
    override val network: CodeableConcept? = null,

    @SerialName("unit")
    override val unit: CodeableConcept? = null,

    @SerialName("term")
    override val term: CodeableConcept? = null,

    @SerialName("financial")
    override val financial: kotlin.collections.List<ExplanationOfBenefitBenefitBalanceFinancial>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirExplanationOfBenefitBenefitBalance {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ExplanationOfBenefitBenefitBalance"
    }
}

/**
 * FhirExplanationOfBenefitBenefitBalanceFinancial
 *
 * Benefits Used to date.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit">ExplanationOfBenefitBenefitBalanceFinancial</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit)
 */
interface FhirExplanationOfBenefitBenefitBalanceFinancial : FhirBackboneElement {

    /**
     * Benefit classification.
     */
    val type: CodeableConcept

    /**
     * Benefits allowed.
     */
    val allowedUnsignedInt: UnsignedInteger?

    /**
     * Benefits allowed.
     */
    val allowedString: String?

    /**
     * Benefits allowed.
     */
    val allowedMoney: Money?

    /**
     * Benefits used.
     */
    val usedUnsignedInt: UnsignedInteger?

    /**
     * Benefits used.
     */
    val usedMoney: Money?
}

/**
 * ExplanationOfBenefitBenefitBalanceFinancial
 *
 * Benefits Used to date.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit">ExplanationOfBenefitBenefitBalanceFinancial</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit)
 */
@Serializable
@SerialName("ExplanationOfBenefitBenefitBalanceFinancial")
data class ExplanationOfBenefitBenefitBalanceFinancial(

    @SerialName("type")
    override val type: CodeableConcept,

    @SerialName("allowedUnsignedInt")
    override val allowedUnsignedInt: UnsignedInteger? = null,

    @SerialName("allowedString")
    override val allowedString: String? = null,

    @SerialName("allowedMoney")
    override val allowedMoney: Money? = null,

    @SerialName("usedUnsignedInt")
    override val usedUnsignedInt: UnsignedInteger? = null,

    @SerialName("usedMoney")
    override val usedMoney: Money? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirExplanationOfBenefitBenefitBalanceFinancial {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ExplanationOfBenefitBenefitBalanceFinancial"
    }
}

/**
 * FhirExplanationOfBenefitCareTeam
 *
 * The members of the team who provided the products and services.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit">ExplanationOfBenefitCareTeam</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit)
 */
interface FhirExplanationOfBenefitCareTeam : FhirBackboneElement {

    /**
     * Order of care team.
     */
    val sequence: PositiveInteger

    /**
     * Practitioner or organization.
     */
    val provider: Reference

    /**
     * Indicator of the lead practitioner.
     */
    val responsible: Bool?

    /**
     * Function within the team.
     */
    val role: CodeableConcept?

    /**
     * Practitioner credential or specialization.
     */
    val qualification: CodeableConcept?
}

/**
 * ExplanationOfBenefitCareTeam
 *
 * The members of the team who provided the products and services.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit">ExplanationOfBenefitCareTeam</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit)
 */
@Serializable
@SerialName("ExplanationOfBenefitCareTeam")
data class ExplanationOfBenefitCareTeam(

    @SerialName("sequence")
    override val sequence: PositiveInteger,

    @SerialName("provider")
    override val provider: Reference,

    @SerialName("responsible")
    override val responsible: Bool? = null,

    @SerialName("role")
    override val role: CodeableConcept? = null,

    @SerialName("qualification")
    override val qualification: CodeableConcept? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirExplanationOfBenefitCareTeam {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ExplanationOfBenefitCareTeam"
    }
}

/**
 * FhirExplanationOfBenefitDiagnosis
 *
 * Information about diagnoses relevant to the claim items.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit">ExplanationOfBenefitDiagnosis</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit)
 */
interface FhirExplanationOfBenefitDiagnosis : FhirBackboneElement {

    /**
     * Diagnosis instance identifier.
     */
    val sequence: PositiveInteger

    /**
     * Nature of illness or problem.
     */
    val diagnosisCodeableConcept: CodeableConcept?

    /**
     * Nature of illness or problem.
     */
    val diagnosisReference: Reference?

    /**
     * Timing or nature of the diagnosis.
     */
    val type: kotlin.collections.List<CodeableConcept>?

    /**
     * Present on admission.
     */
    val onAdmission: CodeableConcept?

    /**
     * Package billing code.
     */
    val packageCode: CodeableConcept?
}

/**
 * ExplanationOfBenefitDiagnosis
 *
 * Information about diagnoses relevant to the claim items.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit">ExplanationOfBenefitDiagnosis</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit)
 */
@Serializable
@SerialName("ExplanationOfBenefitDiagnosis")
data class ExplanationOfBenefitDiagnosis(

    @SerialName("sequence")
    override val sequence: PositiveInteger,

    @SerialName("diagnosisCodeableConcept")
    override val diagnosisCodeableConcept: CodeableConcept? = null,

    @SerialName("diagnosisReference")
    override val diagnosisReference: Reference? = null,

    @SerialName("type")
    override val type: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("onAdmission")
    override val onAdmission: CodeableConcept? = null,

    @SerialName("packageCode")
    override val packageCode: CodeableConcept? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirExplanationOfBenefitDiagnosis {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ExplanationOfBenefitDiagnosis"
    }
}

/**
 * FhirExplanationOfBenefitInsurance
 *
 * Financial instruments for reimbursement for the health care products and services specified on the
 * claim.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit">ExplanationOfBenefitInsurance</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit)
 */
interface FhirExplanationOfBenefitInsurance : FhirBackboneElement {

    /**
     * Coverage to be used for adjudication.
     */
    val focal: Bool

    /**
     * Insurance information.
     */
    val coverage: Reference

    /**
     * Prior authorization reference number.
     */
    val preAuthRef: kotlin.collections.List<String>?
}

/**
 * ExplanationOfBenefitInsurance
 *
 * Financial instruments for reimbursement for the health care products and services specified on the
 * claim.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit">ExplanationOfBenefitInsurance</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit)
 */
@Serializable
@SerialName("ExplanationOfBenefitInsurance")
data class ExplanationOfBenefitInsurance(

    @SerialName("focal")
    override val focal: Bool,

    @SerialName("coverage")
    override val coverage: Reference,

    @SerialName("preAuthRef")
    override val preAuthRef: kotlin.collections.List<String>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirExplanationOfBenefitInsurance {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ExplanationOfBenefitInsurance"
    }
}

/**
 * FhirExplanationOfBenefitItem
 *
 * A claim line. Either a simple (a product or service) or a 'group' of details which can also be a
 * simple items or groups of sub-details.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit">ExplanationOfBenefitItem</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit)
 */
interface FhirExplanationOfBenefitItem : FhirBackboneElement {

    /**
     * Item instance identifier.
     */
    val sequence: PositiveInteger

    /**
     * Applicable care team members.
     */
    val careTeamSequence: kotlin.collections.List<PositiveInteger>?

    /**
     * Applicable diagnoses.
     */
    val diagnosisSequence: kotlin.collections.List<PositiveInteger>?

    /**
     * Applicable procedures.
     */
    val procedureSequence: kotlin.collections.List<PositiveInteger>?

    /**
     * Applicable exception and supporting information.
     */
    val informationSequence: kotlin.collections.List<PositiveInteger>?

    /**
     * Revenue or cost center code.
     */
    val revenue: CodeableConcept?

    /**
     * Benefit classification.
     */
    val category: CodeableConcept?

    /**
     * Billing, service, product, or drug code.
     */
    val productOrService: CodeableConcept

    /**
     * Product or service billing modifiers.
     */
    val modifier: kotlin.collections.List<CodeableConcept>?

    /**
     * Program the product or service is provided under.
     */
    val programCode: kotlin.collections.List<CodeableConcept>?

    /**
     * Date or dates of service or product delivery.
     */
    val servicedDate: Date?

    /**
     * Date or dates of service or product delivery.
     */
    val servicedPeriod: Period?

    /**
     * Place of service or where product was supplied.
     */
    val locationCodeableConcept: CodeableConcept?

    /**
     * Place of service or where product was supplied.
     */
    val locationAddress: Address?

    /**
     * Place of service or where product was supplied.
     */
    val locationReference: Reference?

    /**
     * Count of products or services.
     */
    val quantity: Quantity?

    /**
     * Fee, charge or cost per item.
     */
    val unitPrice: Money?

    /**
     * Price scaling factor.
     */
    val factor: Decimal?

    /**
     * Total item cost.
     */
    val net: Money?

    /**
     * Unique device identifier.
     */
    val udi: kotlin.collections.List<Reference>?

    /**
     * Anatomical location.
     */
    val bodySite: CodeableConcept?

    /**
     * Anatomical sub-location.
     */
    val subSite: kotlin.collections.List<CodeableConcept>?

    /**
     * Encounters related to this billed item.
     */
    val encounter: kotlin.collections.List<Reference>?

    /**
     * Applicable note numbers.
     */
    val noteNumber: kotlin.collections.List<PositiveInteger>?

    /**
     * Adjudication details.
     */
    val adjudication: kotlin.collections.List<ExplanationOfBenefitItemAdjudication>?

    /**
     * Additional items.
     */
    val detail: kotlin.collections.List<ExplanationOfBenefitItemDetail>?
}

/**
 * ExplanationOfBenefitItem
 *
 * A claim line. Either a simple (a product or service) or a 'group' of details which can also be a
 * simple items or groups of sub-details.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit">ExplanationOfBenefitItem</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit)
 */
@Serializable
@SerialName("ExplanationOfBenefitItem")
data class ExplanationOfBenefitItem(

    @SerialName("sequence")
    override val sequence: PositiveInteger,

    @SerialName("careTeamSequence")
    override val careTeamSequence: kotlin.collections.List<PositiveInteger>? = null,

    @SerialName("diagnosisSequence")
    override val diagnosisSequence: kotlin.collections.List<PositiveInteger>? = null,

    @SerialName("procedureSequence")
    override val procedureSequence: kotlin.collections.List<PositiveInteger>? = null,

    @SerialName("informationSequence")
    override val informationSequence: kotlin.collections.List<PositiveInteger>? = null,

    @SerialName("revenue")
    override val revenue: CodeableConcept? = null,

    @SerialName("category")
    override val category: CodeableConcept? = null,

    @SerialName("productOrService")
    override val productOrService: CodeableConcept,

    @SerialName("modifier")
    override val modifier: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("programCode")
    override val programCode: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("servicedDate")
    override val servicedDate: Date? = null,

    @SerialName("servicedPeriod")
    override val servicedPeriod: Period? = null,

    @SerialName("locationCodeableConcept")
    override val locationCodeableConcept: CodeableConcept? = null,

    @SerialName("locationAddress")
    override val locationAddress: Address? = null,

    @SerialName("locationReference")
    override val locationReference: Reference? = null,

    @SerialName("quantity")
    override val quantity: Quantity? = null,

    @SerialName("unitPrice")
    override val unitPrice: Money? = null,

    @SerialName("factor")
    override val factor: Decimal? = null,

    @SerialName("net")
    override val net: Money? = null,

    @SerialName("udi")
    override val udi: kotlin.collections.List<Reference>? = null,

    @SerialName("bodySite")
    override val bodySite: CodeableConcept? = null,

    @SerialName("subSite")
    override val subSite: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("encounter")
    override val encounter: kotlin.collections.List<Reference>? = null,

    @SerialName("noteNumber")
    override val noteNumber: kotlin.collections.List<PositiveInteger>? = null,

    @SerialName("adjudication")
    override val adjudication: kotlin.collections.List<ExplanationOfBenefitItemAdjudication>? = null,

    @SerialName("detail")
    override val detail: kotlin.collections.List<ExplanationOfBenefitItemDetail>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirExplanationOfBenefitItem {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ExplanationOfBenefitItem"
    }
}

/**
 * FhirExplanationOfBenefitItemAdjudication
 *
 * If this item is a group then the values here are a summary of the adjudication of the detail items.
 * If this item is a simple product or service then this is the result of the adjudication of this
 * item.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit">ExplanationOfBenefitItemAdjudication</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit)
 */
interface FhirExplanationOfBenefitItemAdjudication : FhirBackboneElement {

    /**
     * Type of adjudication information.
     */
    val category: CodeableConcept

    /**
     * Explanation of adjudication outcome.
     */
    val reason: CodeableConcept?

    /**
     * Monetary amount.
     */
    val amount: Money?

    /**
     * Non-monitary value.
     */
    val value: Decimal?
}

/**
 * ExplanationOfBenefitItemAdjudication
 *
 * If this item is a group then the values here are a summary of the adjudication of the detail items.
 * If this item is a simple product or service then this is the result of the adjudication of this
 * item.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit">ExplanationOfBenefitItemAdjudication</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit)
 */
@Serializable
@SerialName("ExplanationOfBenefitItemAdjudication")
data class ExplanationOfBenefitItemAdjudication(

    @SerialName("category")
    override val category: CodeableConcept,

    @SerialName("reason")
    override val reason: CodeableConcept? = null,

    @SerialName("amount")
    override val amount: Money? = null,

    @SerialName("value")
    override val value: Decimal? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirExplanationOfBenefitItemAdjudication {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ExplanationOfBenefitItemAdjudication"
    }
}

/**
 * FhirExplanationOfBenefitItemDetail
 *
 * Second-tier of goods and services.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit">ExplanationOfBenefitItemDetail</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit)
 */
interface FhirExplanationOfBenefitItemDetail : FhirBackboneElement {

    /**
     * Product or service provided.
     */
    val sequence: PositiveInteger

    /**
     * Revenue or cost center code.
     */
    val revenue: CodeableConcept?

    /**
     * Benefit classification.
     */
    val category: CodeableConcept?

    /**
     * Billing, service, product, or drug code.
     */
    val productOrService: CodeableConcept

    /**
     * Service/Product billing modifiers.
     */
    val modifier: kotlin.collections.List<CodeableConcept>?

    /**
     * Program the product or service is provided under.
     */
    val programCode: kotlin.collections.List<CodeableConcept>?

    /**
     * Count of products or services.
     */
    val quantity: Quantity?

    /**
     * Fee, charge or cost per item.
     */
    val unitPrice: Money?

    /**
     * Price scaling factor.
     */
    val factor: Decimal?

    /**
     * Total item cost.
     */
    val net: Money?

    /**
     * Unique device identifier.
     */
    val udi: kotlin.collections.List<Reference>?

    /**
     * Applicable note numbers.
     */
    val noteNumber: kotlin.collections.List<PositiveInteger>?

    /**
     * Detail level adjudication details.
     */
    val adjudication: kotlin.collections.List<ExplanationOfBenefitItemAdjudication>?

    /**
     * Additional items.
     */
    val subDetail: kotlin.collections.List<ExplanationOfBenefitItemDetailSubDetail>?
}

/**
 * ExplanationOfBenefitItemDetail
 *
 * Second-tier of goods and services.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit">ExplanationOfBenefitItemDetail</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit)
 */
@Serializable
@SerialName("ExplanationOfBenefitItemDetail")
data class ExplanationOfBenefitItemDetail(

    @SerialName("sequence")
    override val sequence: PositiveInteger,

    @SerialName("revenue")
    override val revenue: CodeableConcept? = null,

    @SerialName("category")
    override val category: CodeableConcept? = null,

    @SerialName("productOrService")
    override val productOrService: CodeableConcept,

    @SerialName("modifier")
    override val modifier: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("programCode")
    override val programCode: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("quantity")
    override val quantity: Quantity? = null,

    @SerialName("unitPrice")
    override val unitPrice: Money? = null,

    @SerialName("factor")
    override val factor: Decimal? = null,

    @SerialName("net")
    override val net: Money? = null,

    @SerialName("udi")
    override val udi: kotlin.collections.List<Reference>? = null,

    @SerialName("noteNumber")
    override val noteNumber: kotlin.collections.List<PositiveInteger>? = null,

    @SerialName("adjudication")
    override val adjudication: kotlin.collections.List<ExplanationOfBenefitItemAdjudication>? = null,

    @SerialName("subDetail")
    override val subDetail: kotlin.collections.List<ExplanationOfBenefitItemDetailSubDetail>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirExplanationOfBenefitItemDetail {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ExplanationOfBenefitItemDetail"
    }
}

/**
 * FhirExplanationOfBenefitItemDetailSubDetail
 *
 * Third-tier of goods and services.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit">ExplanationOfBenefitItemDetailSubDetail</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit)
 */
interface FhirExplanationOfBenefitItemDetailSubDetail : FhirBackboneElement {

    /**
     * Product or service provided.
     */
    val sequence: PositiveInteger

    /**
     * Revenue or cost center code.
     */
    val revenue: CodeableConcept?

    /**
     * Benefit classification.
     */
    val category: CodeableConcept?

    /**
     * Billing, service, product, or drug code.
     */
    val productOrService: CodeableConcept

    /**
     * Service/Product billing modifiers.
     */
    val modifier: kotlin.collections.List<CodeableConcept>?

    /**
     * Program the product or service is provided under.
     */
    val programCode: kotlin.collections.List<CodeableConcept>?

    /**
     * Count of products or services.
     */
    val quantity: Quantity?

    /**
     * Fee, charge or cost per item.
     */
    val unitPrice: Money?

    /**
     * Price scaling factor.
     */
    val factor: Decimal?

    /**
     * Total item cost.
     */
    val net: Money?

    /**
     * Unique device identifier.
     */
    val udi: kotlin.collections.List<Reference>?

    /**
     * Applicable note numbers.
     */
    val noteNumber: kotlin.collections.List<PositiveInteger>?

    /**
     * Subdetail level adjudication details.
     */
    val adjudication: kotlin.collections.List<ExplanationOfBenefitItemAdjudication>?
}

/**
 * ExplanationOfBenefitItemDetailSubDetail
 *
 * Third-tier of goods and services.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit">ExplanationOfBenefitItemDetailSubDetail</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit)
 */
@Serializable
@SerialName("ExplanationOfBenefitItemDetailSubDetail")
data class ExplanationOfBenefitItemDetailSubDetail(

    @SerialName("sequence")
    override val sequence: PositiveInteger,

    @SerialName("revenue")
    override val revenue: CodeableConcept? = null,

    @SerialName("category")
    override val category: CodeableConcept? = null,

    @SerialName("productOrService")
    override val productOrService: CodeableConcept,

    @SerialName("modifier")
    override val modifier: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("programCode")
    override val programCode: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("quantity")
    override val quantity: Quantity? = null,

    @SerialName("unitPrice")
    override val unitPrice: Money? = null,

    @SerialName("factor")
    override val factor: Decimal? = null,

    @SerialName("net")
    override val net: Money? = null,

    @SerialName("udi")
    override val udi: kotlin.collections.List<Reference>? = null,

    @SerialName("noteNumber")
    override val noteNumber: kotlin.collections.List<PositiveInteger>? = null,

    @SerialName("adjudication")
    override val adjudication: kotlin.collections.List<ExplanationOfBenefitItemAdjudication>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirExplanationOfBenefitItemDetailSubDetail {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ExplanationOfBenefitItemDetailSubDetail"
    }
}

/**
 * FhirExplanationOfBenefitPayee
 *
 * The party to be reimbursed for cost of the products and services according to the terms of the
 * policy.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit">ExplanationOfBenefitPayee</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit)
 */
interface FhirExplanationOfBenefitPayee : FhirBackboneElement {

    /**
     * Category of recipient.
     */
    val type: CodeableConcept?

    /**
     * Recipient reference.
     */
    val party: Reference?
}

/**
 * ExplanationOfBenefitPayee
 *
 * The party to be reimbursed for cost of the products and services according to the terms of the
 * policy.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit">ExplanationOfBenefitPayee</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit)
 */
@Serializable
@SerialName("ExplanationOfBenefitPayee")
data class ExplanationOfBenefitPayee(

    @SerialName("type")
    override val type: CodeableConcept? = null,

    @SerialName("party")
    override val party: Reference? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirExplanationOfBenefitPayee {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ExplanationOfBenefitPayee"
    }
}

/**
 * FhirExplanationOfBenefitPayment
 *
 * Payment details for the adjudication of the claim.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit">ExplanationOfBenefitPayment</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit)
 */
interface FhirExplanationOfBenefitPayment : FhirBackboneElement {

    /**
     * Partial or complete payment.
     */
    val type: CodeableConcept?

    /**
     * Payment adjustment for non-claim issues.
     */
    val adjustment: Money?

    /**
     * Explanation for the variance.
     */
    val adjustmentReason: CodeableConcept?

    /**
     * Expected date of payment.
     */
    val date: Date?

    /**
     * Payable amount after adjustment.
     */
    val amount: Money?

    /**
     * Business identifier for the payment.
     */
    val identifier: Identifier?
}

/**
 * ExplanationOfBenefitPayment
 *
 * Payment details for the adjudication of the claim.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit">ExplanationOfBenefitPayment</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit)
 */
@Serializable
@SerialName("ExplanationOfBenefitPayment")
data class ExplanationOfBenefitPayment(

    @SerialName("type")
    override val type: CodeableConcept? = null,

    @SerialName("adjustment")
    override val adjustment: Money? = null,

    @SerialName("adjustmentReason")
    override val adjustmentReason: CodeableConcept? = null,

    @SerialName("date")
    override val date: Date? = null,

    @SerialName("amount")
    override val amount: Money? = null,

    @SerialName("identifier")
    override val identifier: Identifier? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirExplanationOfBenefitPayment {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ExplanationOfBenefitPayment"
    }
}

/**
 * FhirExplanationOfBenefitProcedure
 *
 * Procedures performed on the patient relevant to the billing items with the claim.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit">ExplanationOfBenefitProcedure</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit)
 */
interface FhirExplanationOfBenefitProcedure : FhirBackboneElement {

    /**
     * Procedure instance identifier.
     */
    val sequence: PositiveInteger

    /**
     * Category of Procedure.
     */
    val type: kotlin.collections.List<CodeableConcept>?

    /**
     * When the procedure was performed.
     */
    val date: DateTime?

    /**
     * Specific clinical procedure.
     */
    val procedureCodeableConcept: CodeableConcept?

    /**
     * Specific clinical procedure.
     */
    val procedureReference: Reference?

    /**
     * Unique device identifier.
     */
    val udi: kotlin.collections.List<Reference>?
}

/**
 * ExplanationOfBenefitProcedure
 *
 * Procedures performed on the patient relevant to the billing items with the claim.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit">ExplanationOfBenefitProcedure</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit)
 */
@Serializable
@SerialName("ExplanationOfBenefitProcedure")
data class ExplanationOfBenefitProcedure(

    @SerialName("sequence")
    override val sequence: PositiveInteger,

    @SerialName("type")
    override val type: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("date")
    override val date: DateTime? = null,

    @SerialName("procedureCodeableConcept")
    override val procedureCodeableConcept: CodeableConcept? = null,

    @SerialName("procedureReference")
    override val procedureReference: Reference? = null,

    @SerialName("udi")
    override val udi: kotlin.collections.List<Reference>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirExplanationOfBenefitProcedure {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ExplanationOfBenefitProcedure"
    }
}

/**
 * FhirExplanationOfBenefitProcessNote
 *
 * A note that describes or explains adjudication results in a human readable form.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit">ExplanationOfBenefitProcessNote</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit)
 */
interface FhirExplanationOfBenefitProcessNote : FhirBackboneElement {

    /**
     * Note instance identifier.
     */
    val number: PositiveInteger?

    /**
     * The business purpose of the note text.
     */
    val type: NoteType?

    /**
     * Note explanatory text.
     */
    val text: String?

    /**
     * Language of the text.
     */
    val language: CodeableConcept?
}

/**
 * ExplanationOfBenefitProcessNote
 *
 * A note that describes or explains adjudication results in a human readable form.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit">ExplanationOfBenefitProcessNote</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit)
 */
@Serializable
@SerialName("ExplanationOfBenefitProcessNote")
data class ExplanationOfBenefitProcessNote(

    @SerialName("number")
    override val number: PositiveInteger? = null,

    @SerialName("type")
    override val type: NoteType? = null,

    @SerialName("text")
    override val text: String? = null,

    @SerialName("language")
    override val language: CodeableConcept? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirExplanationOfBenefitProcessNote {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ExplanationOfBenefitProcessNote"
    }
}

/**
 * FhirExplanationOfBenefitRelated
 *
 * Other claims which are related to this claim such as prior submissions or claims for related
 * services or for the same event.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit">ExplanationOfBenefitRelated</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit)
 */
interface FhirExplanationOfBenefitRelated : FhirBackboneElement {

    /**
     * Reference to the related claim.
     */
    val claim: Reference?

    /**
     * How the reference claim is related.
     */
    val relationship: CodeableConcept?

    /**
     * File or case reference.
     */
    val reference: Identifier?
}

/**
 * ExplanationOfBenefitRelated
 *
 * Other claims which are related to this claim such as prior submissions or claims for related
 * services or for the same event.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit">ExplanationOfBenefitRelated</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit)
 */
@Serializable
@SerialName("ExplanationOfBenefitRelated")
data class ExplanationOfBenefitRelated(

    @SerialName("claim")
    override val claim: Reference? = null,

    @SerialName("relationship")
    override val relationship: CodeableConcept? = null,

    @SerialName("reference")
    override val reference: Identifier? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirExplanationOfBenefitRelated {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ExplanationOfBenefitRelated"
    }
}

/**
 * FhirExplanationOfBenefitSupportingInfo
 *
 * Additional information codes regarding exceptions, special considerations, the condition, situation,
 * prior or concurrent issues.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit">ExplanationOfBenefitSupportingInfo</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit)
 */
interface FhirExplanationOfBenefitSupportingInfo : FhirBackboneElement {

    /**
     * Information instance identifier.
     */
    val sequence: PositiveInteger

    /**
     * Classification of the supplied information.
     */
    val category: CodeableConcept

    /**
     * Type of information.
     */
    val code: CodeableConcept?

    /**
     * When it occurred.
     */
    val timingDate: Date?

    /**
     * When it occurred.
     */
    val timingPeriod: Period?

    /**
     * Data to be provided.
     */
    val valueBoolean: Bool?

    /**
     * Data to be provided.
     */
    val valueString: String?

    /**
     * Data to be provided.
     */
    val valueQuantity: Quantity?

    /**
     * Data to be provided.
     */
    val valueAttachment: Attachment?

    /**
     * Data to be provided.
     */
    val valueReference: Reference?

    /**
     * Explanation for the information.
     */
    val reason: Coding?
}

/**
 * ExplanationOfBenefitSupportingInfo
 *
 * Additional information codes regarding exceptions, special considerations, the condition, situation,
 * prior or concurrent issues.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit">ExplanationOfBenefitSupportingInfo</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit)
 */
@Serializable
@SerialName("ExplanationOfBenefitSupportingInfo")
data class ExplanationOfBenefitSupportingInfo(

    @SerialName("sequence")
    override val sequence: PositiveInteger,

    @SerialName("category")
    override val category: CodeableConcept,

    @SerialName("code")
    override val code: CodeableConcept? = null,

    @SerialName("timingDate")
    override val timingDate: Date? = null,

    @SerialName("timingPeriod")
    override val timingPeriod: Period? = null,

    @SerialName("valueBoolean")
    override val valueBoolean: Bool? = null,

    @SerialName("valueString")
    override val valueString: String? = null,

    @SerialName("valueQuantity")
    override val valueQuantity: Quantity? = null,

    @SerialName("valueAttachment")
    override val valueAttachment: Attachment? = null,

    @SerialName("valueReference")
    override val valueReference: Reference? = null,

    @SerialName("reason")
    override val reason: Coding? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirExplanationOfBenefitSupportingInfo {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ExplanationOfBenefitSupportingInfo"
    }
}

/**
 * FhirExplanationOfBenefitTotal
 *
 * Categorized monetary totals for the adjudication.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit">ExplanationOfBenefitTotal</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit)
 */
interface FhirExplanationOfBenefitTotal : FhirBackboneElement {

    /**
     * Type of adjudication information.
     */
    val category: CodeableConcept

    /**
     * Financial total for the category.
     */
    val amount: Money
}

/**
 * ExplanationOfBenefitTotal
 *
 * Categorized monetary totals for the adjudication.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit">ExplanationOfBenefitTotal</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit)
 */
@Serializable
@SerialName("ExplanationOfBenefitTotal")
data class ExplanationOfBenefitTotal(

    @SerialName("category")
    override val category: CodeableConcept,

    @SerialName("amount")
    override val amount: Money,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirExplanationOfBenefitTotal {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ExplanationOfBenefitTotal"
    }
}
