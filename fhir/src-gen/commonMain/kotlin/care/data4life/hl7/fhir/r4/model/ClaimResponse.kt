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
import care.data4life.hl7.fhir.r4.codesystem.Use
import care.data4life.hl7.fhir.r4.primitive.Bool
import care.data4life.hl7.fhir.r4.primitive.Date
import care.data4life.hl7.fhir.r4.primitive.DateTime
import care.data4life.hl7.fhir.r4.primitive.Decimal
import care.data4life.hl7.fhir.r4.primitive.PositiveInteger
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirClaimResponse
 *
 * This resource provides the adjudication details from the processing of a Claim resource.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ClaimResponse">ClaimResponse</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ClaimResponse)
 */
interface FhirClaimResponse : FhirDomainResource {

    /**
     * Business Identifier for a claim response.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * The status of the resource instance.
     */
    val status: FinancialResourceStatusCodes

    /**
     * More granular claim type.
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
     * Response creation date.
     */
    val created: DateTime

    /**
     * Party responsible for reimbursement.
     */
    val insurer: Reference

    /**
     * Party responsible for the claim.
     */
    val requestor: Reference?

    /**
     * Id of resource triggering adjudication.
     */
    val request: Reference?

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
    val preAuthRef: String?

    /**
     * Preauthorization reference effective period.
     */
    val preAuthPeriod: Period?

    /**
     * Party to be paid any benefits payable.
     */
    val payeeType: CodeableConcept?

    /**
     * Adjudication for claim line items.
     */
    val item: kotlin.collections.List<ClaimResponseItem>?

    /**
     * Insurer added line items.
     */
    val addItem: kotlin.collections.List<ClaimResponseAddItem>?

    /**
     * Header-level adjudication.
     */
    val adjudication: kotlin.collections.List<ClaimResponseItemAdjudication>?

    /**
     * Adjudication totals.
     */
    val total: kotlin.collections.List<ClaimResponseTotal>?

    /**
     * Payment Details.
     */
    val payment: ClaimResponsePayment?

    /**
     * Funds reserved status.
     */
    val fundsReserve: CodeableConcept?

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
    val processNote: kotlin.collections.List<ClaimResponseProcessNote>?

    /**
     * Request for additional information.
     */
    val communicationRequest: kotlin.collections.List<Reference>?

    /**
     * Patient insurance information.
     */
    val insurance: kotlin.collections.List<ClaimResponseInsurance>?

    /**
     * Processing errors.
     */
    val error: kotlin.collections.List<ClaimResponseError>?
}

/**
 * ClaimResponse
 *
 * This resource provides the adjudication details from the processing of a Claim resource.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ClaimResponse">ClaimResponse</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ClaimResponse)
 */
@Serializable
@SerialName("ClaimResponse")
data class ClaimResponse(

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("status")
    override val status: FinancialResourceStatusCodes,

    @SerialName("type")
    override val type: CodeableConcept,

    @SerialName("subType")
    override val subType: CodeableConcept? = null,

    @SerialName("use")
    override val use: Use,

    @SerialName("patient")
    override val patient: Reference,

    @SerialName("created")
    override val created: DateTime,

    @SerialName("insurer")
    override val insurer: Reference,

    @SerialName("requestor")
    override val requestor: Reference? = null,

    @SerialName("request")
    override val request: Reference? = null,

    @SerialName("outcome")
    override val outcome: ClaimProcessingCodes,

    @SerialName("disposition")
    override val disposition: String? = null,

    @SerialName("preAuthRef")
    override val preAuthRef: String? = null,

    @SerialName("preAuthPeriod")
    override val preAuthPeriod: Period? = null,

    @SerialName("payeeType")
    override val payeeType: CodeableConcept? = null,

    @SerialName("item")
    override val item: kotlin.collections.List<ClaimResponseItem>? = null,

    @SerialName("addItem")
    override val addItem: kotlin.collections.List<ClaimResponseAddItem>? = null,

    @SerialName("adjudication")
    override val adjudication: kotlin.collections.List<ClaimResponseItemAdjudication>? = null,

    @SerialName("total")
    override val total: kotlin.collections.List<ClaimResponseTotal>? = null,

    @SerialName("payment")
    override val payment: ClaimResponsePayment? = null,

    @SerialName("fundsReserve")
    override val fundsReserve: CodeableConcept? = null,

    @SerialName("formCode")
    override val formCode: CodeableConcept? = null,

    @SerialName("form")
    override val form: Attachment? = null,

    @SerialName("processNote")
    override val processNote: kotlin.collections.List<ClaimResponseProcessNote>? = null,

    @SerialName("communicationRequest")
    override val communicationRequest: kotlin.collections.List<Reference>? = null,

    @SerialName("insurance")
    override val insurance: kotlin.collections.List<ClaimResponseInsurance>? = null,

    @SerialName("error")
    override val error: kotlin.collections.List<ClaimResponseError>? = null,

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
) : FhirClaimResponse {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ClaimResponse"
    }
}

/**
 * FhirClaimResponseAddItem
 *
 * The first-tier service adjudications for payor added product or service lines.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ClaimResponse">ClaimResponseAddItem</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ClaimResponse)
 */
interface FhirClaimResponseAddItem : FhirBackboneElement {

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
    val subdetailSequence: kotlin.collections.List<PositiveInteger>?

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
    val adjudication: kotlin.collections.List<ClaimResponseItemAdjudication>

    /**
     * Insurer added line details.
     */
    val detail: kotlin.collections.List<ClaimResponseAddItemDetail>?
}

/**
 * ClaimResponseAddItem
 *
 * The first-tier service adjudications for payor added product or service lines.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ClaimResponse">ClaimResponseAddItem</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ClaimResponse)
 */
@Serializable
@SerialName("ClaimResponseAddItem")
data class ClaimResponseAddItem(

    @SerialName("itemSequence")
    override val itemSequence: kotlin.collections.List<PositiveInteger>? = null,

    @SerialName("detailSequence")
    override val detailSequence: kotlin.collections.List<PositiveInteger>? = null,

    @SerialName("subdetailSequence")
    override val subdetailSequence: kotlin.collections.List<PositiveInteger>? = null,

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
    override val adjudication: kotlin.collections.List<ClaimResponseItemAdjudication>,

    @SerialName("detail")
    override val detail: kotlin.collections.List<ClaimResponseAddItemDetail>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirClaimResponseAddItem {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ClaimResponseAddItem"
    }
}

/**
 * FhirClaimResponseAddItemDetail
 *
 * The second-tier service adjudications for payor added services.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ClaimResponse">ClaimResponseAddItemDetail</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ClaimResponse)
 */
interface FhirClaimResponseAddItemDetail : FhirBackboneElement {

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
     * Added items detail adjudication.
     */
    val adjudication: kotlin.collections.List<ClaimResponseItemAdjudication>

    /**
     * Insurer added line items.
     */
    val subDetail: kotlin.collections.List<ClaimResponseAddItemDetailSubDetail>?
}

/**
 * ClaimResponseAddItemDetail
 *
 * The second-tier service adjudications for payor added services.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ClaimResponse">ClaimResponseAddItemDetail</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ClaimResponse)
 */
@Serializable
@SerialName("ClaimResponseAddItemDetail")
data class ClaimResponseAddItemDetail(

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
    override val adjudication: kotlin.collections.List<ClaimResponseItemAdjudication>,

    @SerialName("subDetail")
    override val subDetail: kotlin.collections.List<ClaimResponseAddItemDetailSubDetail>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirClaimResponseAddItemDetail {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ClaimResponseAddItemDetail"
    }
}

/**
 * FhirClaimResponseAddItemDetailSubDetail
 *
 * The third-tier service adjudications for payor added services.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ClaimResponse">ClaimResponseAddItemDetailSubDetail</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ClaimResponse)
 */
interface FhirClaimResponseAddItemDetailSubDetail : FhirBackboneElement {

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
     * Added items detail adjudication.
     */
    val adjudication: kotlin.collections.List<ClaimResponseItemAdjudication>
}

/**
 * ClaimResponseAddItemDetailSubDetail
 *
 * The third-tier service adjudications for payor added services.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ClaimResponse">ClaimResponseAddItemDetailSubDetail</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ClaimResponse)
 */
@Serializable
@SerialName("ClaimResponseAddItemDetailSubDetail")
data class ClaimResponseAddItemDetailSubDetail(

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
    override val adjudication: kotlin.collections.List<ClaimResponseItemAdjudication>,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirClaimResponseAddItemDetailSubDetail {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ClaimResponseAddItemDetailSubDetail"
    }
}

/**
 * FhirClaimResponseError
 *
 * Errors encountered during the processing of the adjudication.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ClaimResponse">ClaimResponseError</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ClaimResponse)
 */
interface FhirClaimResponseError : FhirBackboneElement {

    /**
     * Item sequence number.
     */
    val itemSequence: PositiveInteger?

    /**
     * Detail sequence number.
     */
    val detailSequence: PositiveInteger?

    /**
     * Subdetail sequence number.
     */
    val subDetailSequence: PositiveInteger?

    /**
     * Error code detailing processing issues.
     */
    val code: CodeableConcept
}

/**
 * ClaimResponseError
 *
 * Errors encountered during the processing of the adjudication.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ClaimResponse">ClaimResponseError</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ClaimResponse)
 */
@Serializable
@SerialName("ClaimResponseError")
data class ClaimResponseError(

    @SerialName("itemSequence")
    override val itemSequence: PositiveInteger? = null,

    @SerialName("detailSequence")
    override val detailSequence: PositiveInteger? = null,

    @SerialName("subDetailSequence")
    override val subDetailSequence: PositiveInteger? = null,

    @SerialName("code")
    override val code: CodeableConcept,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirClaimResponseError {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ClaimResponseError"
    }
}

/**
 * FhirClaimResponseInsurance
 *
 * Financial instruments for reimbursement for the health care products and services specified on the
 * claim.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ClaimResponse">ClaimResponseInsurance</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ClaimResponse)
 */
interface FhirClaimResponseInsurance : FhirBackboneElement {

    /**
     * Insurance instance identifier.
     */
    val sequence: PositiveInteger

    /**
     * Coverage to be used for adjudication.
     */
    val focal: Bool

    /**
     * Insurance information.
     */
    val coverage: Reference

    /**
     * Additional provider contract number.
     */
    val businessArrangement: String?

    /**
     * Adjudication results.
     */
    val claimResponse: Reference?
}

/**
 * ClaimResponseInsurance
 *
 * Financial instruments for reimbursement for the health care products and services specified on the
 * claim.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ClaimResponse">ClaimResponseInsurance</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ClaimResponse)
 */
@Serializable
@SerialName("ClaimResponseInsurance")
data class ClaimResponseInsurance(

    @SerialName("sequence")
    override val sequence: PositiveInteger,

    @SerialName("focal")
    override val focal: Bool,

    @SerialName("coverage")
    override val coverage: Reference,

    @SerialName("businessArrangement")
    override val businessArrangement: String? = null,

    @SerialName("claimResponse")
    override val claimResponse: Reference? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirClaimResponseInsurance {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ClaimResponseInsurance"
    }
}

/**
 * FhirClaimResponseItem
 *
 * A claim line. Either a simple (a product or service) or a 'group' of details which can also be a
 * simple items or groups of sub-details.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ClaimResponse">ClaimResponseItem</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ClaimResponse)
 */
interface FhirClaimResponseItem : FhirBackboneElement {

    /**
     * Claim item instance identifier.
     */
    val itemSequence: PositiveInteger

    /**
     * Applicable note numbers.
     */
    val noteNumber: kotlin.collections.List<PositiveInteger>?

    /**
     * Adjudication details.
     */
    val adjudication: kotlin.collections.List<ClaimResponseItemAdjudication>

    /**
     * Adjudication for claim details.
     */
    val detail: kotlin.collections.List<ClaimResponseItemDetail>?
}

/**
 * ClaimResponseItem
 *
 * A claim line. Either a simple (a product or service) or a 'group' of details which can also be a
 * simple items or groups of sub-details.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ClaimResponse">ClaimResponseItem</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ClaimResponse)
 */
@Serializable
@SerialName("ClaimResponseItem")
data class ClaimResponseItem(

    @SerialName("itemSequence")
    override val itemSequence: PositiveInteger,

    @SerialName("noteNumber")
    override val noteNumber: kotlin.collections.List<PositiveInteger>? = null,

    @SerialName("adjudication")
    override val adjudication: kotlin.collections.List<ClaimResponseItemAdjudication>,

    @SerialName("detail")
    override val detail: kotlin.collections.List<ClaimResponseItemDetail>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirClaimResponseItem {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ClaimResponseItem"
    }
}

/**
 * FhirClaimResponseItemAdjudication
 *
 * If this item is a group then the values here are a summary of the adjudication of the detail items.
 * If this item is a simple product or service then this is the result of the adjudication of this
 * item.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ClaimResponse">ClaimResponseItemAdjudication</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ClaimResponse)
 */
interface FhirClaimResponseItemAdjudication : FhirBackboneElement {

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
     * Non-monetary value.
     */
    val value: Decimal?
}

/**
 * ClaimResponseItemAdjudication
 *
 * If this item is a group then the values here are a summary of the adjudication of the detail items.
 * If this item is a simple product or service then this is the result of the adjudication of this
 * item.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ClaimResponse">ClaimResponseItemAdjudication</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ClaimResponse)
 */
@Serializable
@SerialName("ClaimResponseItemAdjudication")
data class ClaimResponseItemAdjudication(

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
) : FhirClaimResponseItemAdjudication {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ClaimResponseItemAdjudication"
    }
}

/**
 * FhirClaimResponseItemDetail
 *
 * A claim detail. Either a simple (a product or service) or a 'group' of sub-details which are simple
 * items.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ClaimResponse">ClaimResponseItemDetail</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ClaimResponse)
 */
interface FhirClaimResponseItemDetail : FhirBackboneElement {

    /**
     * Claim detail instance identifier.
     */
    val detailSequence: PositiveInteger

    /**
     * Applicable note numbers.
     */
    val noteNumber: kotlin.collections.List<PositiveInteger>?

    /**
     * Detail level adjudication details.
     */
    val adjudication: kotlin.collections.List<ClaimResponseItemAdjudication>

    /**
     * Adjudication for claim sub-details.
     */
    val subDetail: kotlin.collections.List<ClaimResponseItemDetailSubDetail>?
}

/**
 * ClaimResponseItemDetail
 *
 * A claim detail. Either a simple (a product or service) or a 'group' of sub-details which are simple
 * items.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ClaimResponse">ClaimResponseItemDetail</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ClaimResponse)
 */
@Serializable
@SerialName("ClaimResponseItemDetail")
data class ClaimResponseItemDetail(

    @SerialName("detailSequence")
    override val detailSequence: PositiveInteger,

    @SerialName("noteNumber")
    override val noteNumber: kotlin.collections.List<PositiveInteger>? = null,

    @SerialName("adjudication")
    override val adjudication: kotlin.collections.List<ClaimResponseItemAdjudication>,

    @SerialName("subDetail")
    override val subDetail: kotlin.collections.List<ClaimResponseItemDetailSubDetail>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirClaimResponseItemDetail {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ClaimResponseItemDetail"
    }
}

/**
 * FhirClaimResponseItemDetailSubDetail
 *
 * A sub-detail adjudication of a simple product or service.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ClaimResponse">ClaimResponseItemDetailSubDetail</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ClaimResponse)
 */
interface FhirClaimResponseItemDetailSubDetail : FhirBackboneElement {

    /**
     * Claim sub-detail instance identifier.
     */
    val subDetailSequence: PositiveInteger

    /**
     * Applicable note numbers.
     */
    val noteNumber: kotlin.collections.List<PositiveInteger>?

    /**
     * Subdetail level adjudication details.
     */
    val adjudication: kotlin.collections.List<ClaimResponseItemAdjudication>?
}

/**
 * ClaimResponseItemDetailSubDetail
 *
 * A sub-detail adjudication of a simple product or service.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ClaimResponse">ClaimResponseItemDetailSubDetail</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ClaimResponse)
 */
@Serializable
@SerialName("ClaimResponseItemDetailSubDetail")
data class ClaimResponseItemDetailSubDetail(

    @SerialName("subDetailSequence")
    override val subDetailSequence: PositiveInteger,

    @SerialName("noteNumber")
    override val noteNumber: kotlin.collections.List<PositiveInteger>? = null,

    @SerialName("adjudication")
    override val adjudication: kotlin.collections.List<ClaimResponseItemAdjudication>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirClaimResponseItemDetailSubDetail {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ClaimResponseItemDetailSubDetail"
    }
}

/**
 * FhirClaimResponsePayment
 *
 * Payment details for the adjudication of the claim.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ClaimResponse">ClaimResponsePayment</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ClaimResponse)
 */
interface FhirClaimResponsePayment : FhirBackboneElement {

    /**
     * Partial or complete payment.
     */
    val type: CodeableConcept

    /**
     * Payment adjustment for non-claim issues.
     */
    val adjustment: Money?

    /**
     * Explanation for the adjustment.
     */
    val adjustmentReason: CodeableConcept?

    /**
     * Expected date of payment.
     */
    val date: Date?

    /**
     * Payable amount after adjustment.
     */
    val amount: Money

    /**
     * Business identifier for the payment.
     */
    val identifier: Identifier?
}

/**
 * ClaimResponsePayment
 *
 * Payment details for the adjudication of the claim.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ClaimResponse">ClaimResponsePayment</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ClaimResponse)
 */
@Serializable
@SerialName("ClaimResponsePayment")
data class ClaimResponsePayment(

    @SerialName("type")
    override val type: CodeableConcept,

    @SerialName("adjustment")
    override val adjustment: Money? = null,

    @SerialName("adjustmentReason")
    override val adjustmentReason: CodeableConcept? = null,

    @SerialName("date")
    override val date: Date? = null,

    @SerialName("amount")
    override val amount: Money,

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
) : FhirClaimResponsePayment {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ClaimResponsePayment"
    }
}

/**
 * FhirClaimResponseProcessNote
 *
 * A note that describes or explains adjudication results in a human readable form.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ClaimResponse">ClaimResponseProcessNote</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ClaimResponse)
 */
interface FhirClaimResponseProcessNote : FhirBackboneElement {

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
    val text: String

    /**
     * Language of the text.
     */
    val language: CodeableConcept?
}

/**
 * ClaimResponseProcessNote
 *
 * A note that describes or explains adjudication results in a human readable form.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ClaimResponse">ClaimResponseProcessNote</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ClaimResponse)
 */
@Serializable
@SerialName("ClaimResponseProcessNote")
data class ClaimResponseProcessNote(

    @SerialName("number")
    override val number: PositiveInteger? = null,

    @SerialName("type")
    override val type: NoteType? = null,

    @SerialName("text")
    override val text: String,

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
) : FhirClaimResponseProcessNote {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ClaimResponseProcessNote"
    }
}

/**
 * FhirClaimResponseTotal
 *
 * Categorized monetary totals for the adjudication.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ClaimResponse">ClaimResponseTotal</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ClaimResponse)
 */
interface FhirClaimResponseTotal : FhirBackboneElement {

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
 * ClaimResponseTotal
 *
 * Categorized monetary totals for the adjudication.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ClaimResponse">ClaimResponseTotal</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ClaimResponse)
 */
@Serializable
@SerialName("ClaimResponseTotal")
data class ClaimResponseTotal(

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
) : FhirClaimResponseTotal {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ClaimResponseTotal"
    }
}
