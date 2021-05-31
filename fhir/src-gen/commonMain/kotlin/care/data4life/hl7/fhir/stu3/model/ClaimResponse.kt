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

import care.data4life.hl7.fhir.stu3.primitive.Bool
import care.data4life.hl7.fhir.stu3.primitive.Date
import care.data4life.hl7.fhir.stu3.primitive.DateTime
import care.data4life.hl7.fhir.stu3.primitive.Decimal
import care.data4life.hl7.fhir.stu3.primitive.PositiveInteger
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
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ClaimResponse)
 */
interface FhirClaimResponse : FhirDomainResource {

    /**
     * Response number.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * active | cancelled | draft | entered-in-error.
     */
    val status: String?

    /**
     * The subject of the Products and Services.
     */
    val patient: Reference?

    /**
     * Creation date.
     */
    val created: DateTime?

    /**
     * Insurance issuing organization.
     */
    val insurer: Reference?

    /**
     * Responsible practitioner.
     */
    val requestProvider: Reference?

    /**
     * Responsible organization.
     */
    val requestOrganization: Reference?

    /**
     * Id of resource triggering adjudication.
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
     * Party to be paid any benefits payable.
     */
    val payeeType: CodeableConcept?

    /**
     * Line items.
     */
    val item: kotlin.collections.List<ClaimResponseItem>?

    /**
     * Insurer added line items.
     */
    val addItem: kotlin.collections.List<ClaimResponseAddItem>?

    /**
     * Processing errors.
     */
    val error: kotlin.collections.List<ClaimResponseError>?

    /**
     * Total Cost of service from the Claim.
     */
    val totalCost: Money?

    /**
     * Unallocated deductible.
     */
    val unallocDeductable: Money?

    /**
     * Total benefit payable for the Claim.
     */
    val totalBenefit: Money?

    /**
     * Payment details, if paid.
     */
    val payment: ClaimResponsePayment?

    /**
     * Funds reserved status.
     */
    val reserved: Coding?

    /**
     * Printed Form Identifier.
     */
    val form: CodeableConcept?

    /**
     * Processing notes.
     */
    val processNote: kotlin.collections.List<ClaimResponseProcessNote>?

    /**
     * Request for additional information.
     */
    val communicationRequest: kotlin.collections.List<Reference>?

    /**
     * Insurance or medical plan.
     */
    val insurance: kotlin.collections.List<ClaimResponseInsurance>?
}

/**
 * ClaimResponse
 *
 * This resource provides the adjudication details from the processing of a Claim resource.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ClaimResponse">ClaimResponse</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ClaimResponse)
 */
@Serializable
@SerialName("ClaimResponse")
data class ClaimResponse(

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("status")
    override val status: String? = null,

    @SerialName("patient")
    override val patient: Reference? = null,

    @SerialName("created")
    override val created: DateTime? = null,

    @SerialName("insurer")
    override val insurer: Reference? = null,

    @SerialName("requestProvider")
    override val requestProvider: Reference? = null,

    @SerialName("requestOrganization")
    override val requestOrganization: Reference? = null,

    @SerialName("request")
    override val request: Reference? = null,

    @SerialName("outcome")
    override val outcome: CodeableConcept? = null,

    @SerialName("disposition")
    override val disposition: String? = null,

    @SerialName("payeeType")
    override val payeeType: CodeableConcept? = null,

    @SerialName("item")
    override val item: kotlin.collections.List<ClaimResponseItem>? = null,

    @SerialName("addItem")
    override val addItem: kotlin.collections.List<ClaimResponseAddItem>? = null,

    @SerialName("error")
    override val error: kotlin.collections.List<ClaimResponseError>? = null,

    @SerialName("totalCost")
    override val totalCost: Money? = null,

    @SerialName("unallocDeductable")
    override val unallocDeductable: Money? = null,

    @SerialName("totalBenefit")
    override val totalBenefit: Money? = null,

    @SerialName("payment")
    override val payment: ClaimResponsePayment? = null,

    @SerialName("reserved")
    override val reserved: Coding? = null,

    @SerialName("form")
    override val form: CodeableConcept? = null,

    @SerialName("processNote")
    override val processNote: kotlin.collections.List<ClaimResponseProcessNote>? = null,

    @SerialName("communicationRequest")
    override val communicationRequest: kotlin.collections.List<Reference>? = null,

    @SerialName("insurance")
    override val insurance: kotlin.collections.List<ClaimResponseInsurance>? = null,

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

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ClaimResponse"
    }
}

/**
 * FhirClaimResponseAddItem
 *
 * The first tier service adjudications for payor added services.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ClaimResponse">ClaimResponseAddItem</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ClaimResponse)
 */
interface FhirClaimResponseAddItem : FhirBackboneElement {

    /**
     * Service instances.
     */
    val sequenceLinkId: kotlin.collections.List<PositiveInteger>?

    /**
     * Revenue or cost center code.
     */
    val revenue: CodeableConcept?

    /**
     * Type of service or product.
     */
    val category: CodeableConcept?

    /**
     * Group, Service or Product.
     */
    val service: CodeableConcept?

    /**
     * Service/Product billing modifiers.
     */
    val modifier: kotlin.collections.List<CodeableConcept>?

    /**
     * Professional fee or Product charge.
     */
    val fee: Money?

    /**
     * List of note numbers which apply.
     */
    val noteNumber: kotlin.collections.List<PositiveInteger>?

    /**
     * Added items adjudication.
     */
    val adjudication: kotlin.collections.List<ClaimResponseItemAdjudication>?

    /**
     * Added items details.
     */
    val detail: kotlin.collections.List<ClaimResponseAddItemDetail>?
}

/**
 * ClaimResponseAddItem
 *
 * The first tier service adjudications for payor added services.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ClaimResponse">ClaimResponseAddItem</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ClaimResponse)
 */
@Serializable
@SerialName("ClaimResponseAddItem")
data class ClaimResponseAddItem(

    @SerialName("sequenceLinkId")
    override val sequenceLinkId: kotlin.collections.List<PositiveInteger>? = null,

    @SerialName("revenue")
    override val revenue: CodeableConcept? = null,

    @SerialName("category")
    override val category: CodeableConcept? = null,

    @SerialName("service")
    override val service: CodeableConcept? = null,

    @SerialName("modifier")
    override val modifier: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("fee")
    override val fee: Money? = null,

    @SerialName("noteNumber")
    override val noteNumber: kotlin.collections.List<PositiveInteger>? = null,

    @SerialName("adjudication")
    override val adjudication: kotlin.collections.List<ClaimResponseItemAdjudication>? = null,

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

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ClaimResponseAddItem"
    }
}

/**
 * FhirClaimResponseAddItemDetail
 *
 * The second tier service adjudications for payor added services.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ClaimResponse">ClaimResponseAddItemDetail</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ClaimResponse)
 */
interface FhirClaimResponseAddItemDetail : FhirBackboneElement {

    /**
     * Revenue or cost center code.
     */
    val revenue: CodeableConcept?

    /**
     * Type of service or product.
     */
    val category: CodeableConcept?

    /**
     * Service or Product.
     */
    val service: CodeableConcept?

    /**
     * Service/Product billing modifiers.
     */
    val modifier: kotlin.collections.List<CodeableConcept>?

    /**
     * Professional fee or Product charge.
     */
    val fee: Money?

    /**
     * List of note numbers which apply.
     */
    val noteNumber: kotlin.collections.List<PositiveInteger>?

    /**
     * Added items detail adjudication.
     */
    val adjudication: kotlin.collections.List<ClaimResponseItemAdjudication>?
}

/**
 * ClaimResponseAddItemDetail
 *
 * The second tier service adjudications for payor added services.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ClaimResponse">ClaimResponseAddItemDetail</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ClaimResponse)
 */
@Serializable
@SerialName("ClaimResponseAddItemDetail")
data class ClaimResponseAddItemDetail(

    @SerialName("revenue")
    override val revenue: CodeableConcept? = null,

    @SerialName("category")
    override val category: CodeableConcept? = null,

    @SerialName("service")
    override val service: CodeableConcept? = null,

    @SerialName("modifier")
    override val modifier: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("fee")
    override val fee: Money? = null,

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
) : FhirClaimResponseAddItemDetail {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ClaimResponseAddItemDetail"
    }
}

/**
 * FhirClaimResponseError
 *
 * Mutually exclusive with Services Provided (Item).
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ClaimResponse">ClaimResponseError</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ClaimResponse)
 */
interface FhirClaimResponseError : FhirBackboneElement {

    /**
     * Item sequence number.
     */
    val sequenceLinkId: PositiveInteger?

    /**
     * Detail sequence number.
     */
    val detailSequenceLinkId: PositiveInteger?

    /**
     * Subdetail sequence number.
     */
    val subdetailSequenceLinkId: PositiveInteger?

    /**
     * Error code detailing processing issues.
     */
    val code: CodeableConcept
}

/**
 * ClaimResponseError
 *
 * Mutually exclusive with Services Provided (Item).
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ClaimResponse">ClaimResponseError</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ClaimResponse)
 */
@Serializable
@SerialName("ClaimResponseError")
data class ClaimResponseError(

    @SerialName("sequenceLinkId")
    override val sequenceLinkId: PositiveInteger? = null,

    @SerialName("detailSequenceLinkId")
    override val detailSequenceLinkId: PositiveInteger? = null,

    @SerialName("subdetailSequenceLinkId")
    override val subdetailSequenceLinkId: PositiveInteger? = null,

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

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ClaimResponseError"
    }
}

/**
 * FhirClaimResponseInsurance
 *
 * Financial instrument by which payment information for health care.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ClaimResponse">ClaimResponseInsurance</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ClaimResponse)
 */
interface FhirClaimResponseInsurance : FhirBackboneElement {

    /**
     * Service instance identifier.
     */
    val sequence: PositiveInteger

    /**
     * Is the focal Coverage.
     */
    val focal: Bool

    /**
     * Insurance information.
     */
    val coverage: Reference

    /**
     * Business agreement.
     */
    val businessArrangement: String?

    /**
     * Pre-Authorization/Determination Reference.
     */
    val preAuthRef: kotlin.collections.List<String>?

    /**
     * Adjudication results.
     */
    val claimResponse: Reference?
}

/**
 * ClaimResponseInsurance
 *
 * Financial instrument by which payment information for health care.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ClaimResponse">ClaimResponseInsurance</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ClaimResponse)
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

    @SerialName("preAuthRef")
    override val preAuthRef: kotlin.collections.List<String>? = null,

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

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ClaimResponseInsurance"
    }
}

/**
 * FhirClaimResponseItem
 *
 * The first tier service adjudications for submitted services.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ClaimResponse">ClaimResponseItem</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ClaimResponse)
 */
interface FhirClaimResponseItem : FhirBackboneElement {

    /**
     * Service instance.
     */
    val sequenceLinkId: PositiveInteger

    /**
     * List of note numbers which apply.
     */
    val noteNumber: kotlin.collections.List<PositiveInteger>?

    /**
     * Adjudication details.
     */
    val adjudication: kotlin.collections.List<ClaimResponseItemAdjudication>?

    /**
     * Detail line items.
     */
    val detail: kotlin.collections.List<ClaimResponseItemDetail>?
}

/**
 * ClaimResponseItem
 *
 * The first tier service adjudications for submitted services.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ClaimResponse">ClaimResponseItem</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ClaimResponse)
 */
@Serializable
@SerialName("ClaimResponseItem")
data class ClaimResponseItem(

    @SerialName("sequenceLinkId")
    override val sequenceLinkId: PositiveInteger,

    @SerialName("noteNumber")
    override val noteNumber: kotlin.collections.List<PositiveInteger>? = null,

    @SerialName("adjudication")
    override val adjudication: kotlin.collections.List<ClaimResponseItemAdjudication>? = null,

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

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ClaimResponseItem"
    }
}

/**
 * FhirClaimResponseItemAdjudication
 *
 * The adjudication results.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ClaimResponse">ClaimResponseItemAdjudication</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ClaimResponse)
 */
interface FhirClaimResponseItemAdjudication : FhirBackboneElement {

    /**
     * Adjudication category such as co-pay, eligible, benefit, etc..
     */
    val category: CodeableConcept

    /**
     * Explanation of Adjudication outcome.
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
 * The adjudication results.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ClaimResponse">ClaimResponseItemAdjudication</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ClaimResponse)
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

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ClaimResponseItemAdjudication"
    }
}

/**
 * FhirClaimResponseItemDetail
 *
 * The second tier service adjudications for submitted services.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ClaimResponse">ClaimResponseItemDetail</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ClaimResponse)
 */
interface FhirClaimResponseItemDetail : FhirBackboneElement {

    /**
     * Service instance.
     */
    val sequenceLinkId: PositiveInteger

    /**
     * List of note numbers which apply.
     */
    val noteNumber: kotlin.collections.List<PositiveInteger>?

    /**
     * Detail level adjudication details.
     */
    val adjudication: kotlin.collections.List<ClaimResponseItemAdjudication>?

    /**
     * Subdetail line items.
     */
    val subDetail: kotlin.collections.List<ClaimResponseItemDetailSubDetail>?
}

/**
 * ClaimResponseItemDetail
 *
 * The second tier service adjudications for submitted services.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ClaimResponse">ClaimResponseItemDetail</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ClaimResponse)
 */
@Serializable
@SerialName("ClaimResponseItemDetail")
data class ClaimResponseItemDetail(

    @SerialName("sequenceLinkId")
    override val sequenceLinkId: PositiveInteger,

    @SerialName("noteNumber")
    override val noteNumber: kotlin.collections.List<PositiveInteger>? = null,

    @SerialName("adjudication")
    override val adjudication: kotlin.collections.List<ClaimResponseItemAdjudication>? = null,

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

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ClaimResponseItemDetail"
    }
}

/**
 * FhirClaimResponseItemDetailSubDetail
 *
 * The third tier service adjudications for submitted services.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ClaimResponse">ClaimResponseItemDetailSubDetail</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ClaimResponse)
 */
interface FhirClaimResponseItemDetailSubDetail : FhirBackboneElement {

    /**
     * Service instance.
     */
    val sequenceLinkId: PositiveInteger

    /**
     * List of note numbers which apply.
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
 * The third tier service adjudications for submitted services.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ClaimResponse">ClaimResponseItemDetailSubDetail</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ClaimResponse)
 */
@Serializable
@SerialName("ClaimResponseItemDetailSubDetail")
data class ClaimResponseItemDetailSubDetail(

    @SerialName("sequenceLinkId")
    override val sequenceLinkId: PositiveInteger,

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

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ClaimResponseItemDetailSubDetail"
    }
}

/**
 * FhirClaimResponsePayment
 *
 * Payment details for the claim if the claim has been paid.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ClaimResponse">ClaimResponsePayment</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ClaimResponse)
 */
interface FhirClaimResponsePayment : FhirBackboneElement {

    /**
     * Partial or Complete.
     */
    val type: CodeableConcept?

    /**
     * Payment adjustment for non-Claim issues.
     */
    val adjustment: Money?

    /**
     * Explanation for the non-claim adjustment.
     */
    val adjustmentReason: CodeableConcept?

    /**
     * Expected data of Payment.
     */
    val date: Date?

    /**
     * Payable amount after adjustment.
     */
    val amount: Money?

    /**
     * Identifier of the payment instrument.
     */
    val identifier: Identifier?
}

/**
 * ClaimResponsePayment
 *
 * Payment details for the claim if the claim has been paid.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ClaimResponse">ClaimResponsePayment</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ClaimResponse)
 */
@Serializable
@SerialName("ClaimResponsePayment")
data class ClaimResponsePayment(

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
) : FhirClaimResponsePayment {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ClaimResponsePayment"
    }
}

/**
 * FhirClaimResponseProcessNote
 *
 * Note text.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ClaimResponse">ClaimResponseProcessNote</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ClaimResponse)
 */
interface FhirClaimResponseProcessNote : FhirBackboneElement {

    /**
     * Sequence Number for this note.
     */
    val number: PositiveInteger?

    /**
     * display | print | printoper.
     */
    val type: CodeableConcept?

    /**
     * Note explanatory text.
     */
    val text: String?

    /**
     * Language if different from the resource.
     */
    val language: CodeableConcept?
}

/**
 * ClaimResponseProcessNote
 *
 * Note text.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ClaimResponse">ClaimResponseProcessNote</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ClaimResponse)
 */
@Serializable
@SerialName("ClaimResponseProcessNote")
data class ClaimResponseProcessNote(

    @SerialName("number")
    override val number: PositiveInteger? = null,

    @SerialName("type")
    override val type: CodeableConcept? = null,

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
) : FhirClaimResponseProcessNote {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ClaimResponseProcessNote"
    }
}
