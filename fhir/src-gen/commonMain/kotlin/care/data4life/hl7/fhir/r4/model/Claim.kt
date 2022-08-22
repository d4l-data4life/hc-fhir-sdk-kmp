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
import care.data4life.hl7.fhir.r4.codesystem.Use
import care.data4life.hl7.fhir.r4.primitive.Bool
import care.data4life.hl7.fhir.r4.primitive.Date
import care.data4life.hl7.fhir.r4.primitive.DateTime
import care.data4life.hl7.fhir.r4.primitive.Decimal
import care.data4life.hl7.fhir.r4.primitive.PositiveInteger
import kotlin.jvm.JvmStatic
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * FhirClaim
 *
 * A provider issued list of professional services and products which have been provided, or are to be
 * provided, to a patient which is sent to an insurer for reimbursement.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Claim">Claim</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Claim)
 */
interface FhirClaim : FhirDomainResource {

    /**
     * Business Identifier for claim.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * The status of the resource instance.
     */
    val status: FinancialResourceStatusCodes

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
     * Resource creation date.
     */
    val created: DateTime

    /**
     * Author of the claim.
     */
    val enterer: Reference?

    /**
     * Target.
     */
    val insurer: Reference?

    /**
     * Party responsible for the claim.
     */
    val provider: Reference

    /**
     * Desired processing ugency.
     */
    val priority: CodeableConcept

    /**
     * For whom to reserve funds.
     */
    val fundsReserve: CodeableConcept?

    /**
     * Prior or corollary claims.
     */
    val related: kotlin.collections.List<ClaimRelated>?

    /**
     * Prescription authorizing services and products.
     */
    val prescription: Reference?

    /**
     * Original prescription if superseded by fulfiller.
     */
    val originalPrescription: Reference?

    /**
     * Recipient of benefits payable.
     */
    val payee: ClaimPayee?

    /**
     * Treatment referral.
     */
    val referral: Reference?

    /**
     * Servicing facility.
     */
    val facility: Reference?

    /**
     * Members of the care team.
     */
    val careTeam: kotlin.collections.List<ClaimCareTeam>?

    /**
     * Supporting information.
     */
    val supportingInfo: kotlin.collections.List<ClaimSupportingInfo>?

    /**
     * Pertinent diagnosis information.
     */
    val diagnosis: kotlin.collections.List<ClaimDiagnosis>?

    /**
     * Clinical procedures performed.
     */
    val procedure: kotlin.collections.List<ClaimProcedure>?

    /**
     * Patient insurance information.
     */
    val insurance: kotlin.collections.List<ClaimInsurance>

    /**
     * Details of the event.
     */
    val accident: ClaimAccident?

    /**
     * Product or service provided.
     */
    val item: kotlin.collections.List<ClaimItem>?

    /**
     * Total claim cost.
     */
    val total: Money?
}

/**
 * Claim
 *
 * A provider issued list of professional services and products which have been provided, or are to be
 * provided, to a patient which is sent to an insurer for reimbursement.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Claim">Claim</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Claim)
 */
@Serializable
@SerialName("Claim")
data class Claim(

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

    @SerialName("billablePeriod")
    override val billablePeriod: Period? = null,

    @SerialName("created")
    override val created: DateTime,

    @SerialName("enterer")
    override val enterer: Reference? = null,

    @SerialName("insurer")
    override val insurer: Reference? = null,

    @SerialName("provider")
    override val provider: Reference,

    @SerialName("priority")
    override val priority: CodeableConcept,

    @SerialName("fundsReserve")
    override val fundsReserve: CodeableConcept? = null,

    @SerialName("related")
    override val related: kotlin.collections.List<ClaimRelated>? = null,

    @SerialName("prescription")
    override val prescription: Reference? = null,

    @SerialName("originalPrescription")
    override val originalPrescription: Reference? = null,

    @SerialName("payee")
    override val payee: ClaimPayee? = null,

    @SerialName("referral")
    override val referral: Reference? = null,

    @SerialName("facility")
    override val facility: Reference? = null,

    @SerialName("careTeam")
    override val careTeam: kotlin.collections.List<ClaimCareTeam>? = null,

    @SerialName("supportingInfo")
    override val supportingInfo: kotlin.collections.List<ClaimSupportingInfo>? = null,

    @SerialName("diagnosis")
    override val diagnosis: kotlin.collections.List<ClaimDiagnosis>? = null,

    @SerialName("procedure")
    override val procedure: kotlin.collections.List<ClaimProcedure>? = null,

    @SerialName("insurance")
    override val insurance: kotlin.collections.List<ClaimInsurance>,

    @SerialName("accident")
    override val accident: ClaimAccident? = null,

    @SerialName("item")
    override val item: kotlin.collections.List<ClaimItem>? = null,

    @SerialName("total")
    override val total: Money? = null,

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
) : FhirClaim {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "Claim"
    }
}

/**
 * FhirClaimAccident
 *
 * Details of an accident which resulted in injuries which required the products and services listed in
 * the claim.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Claim">ClaimAccident</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Claim)
 */
interface FhirClaimAccident : FhirBackboneElement {

    /**
     * When the incident occurred.
     */
    val date: Date

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
 * ClaimAccident
 *
 * Details of an accident which resulted in injuries which required the products and services listed in
 * the claim.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Claim">ClaimAccident</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Claim)
 */
@Serializable
@SerialName("ClaimAccident")
data class ClaimAccident(

    @SerialName("date")
    override val date: Date,

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
) : FhirClaimAccident {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ClaimAccident"
    }
}

/**
 * FhirClaimCareTeam
 *
 * The members of the team who provided the products and services.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Claim">ClaimCareTeam</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Claim)
 */
interface FhirClaimCareTeam : FhirBackboneElement {

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
 * ClaimCareTeam
 *
 * The members of the team who provided the products and services.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Claim">ClaimCareTeam</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Claim)
 */
@Serializable
@SerialName("ClaimCareTeam")
data class ClaimCareTeam(

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
) : FhirClaimCareTeam {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ClaimCareTeam"
    }
}

/**
 * FhirClaimDiagnosis
 *
 * Information about diagnoses relevant to the claim items.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Claim">ClaimDiagnosis</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Claim)
 */
interface FhirClaimDiagnosis : FhirBackboneElement {

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
 * ClaimDiagnosis
 *
 * Information about diagnoses relevant to the claim items.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Claim">ClaimDiagnosis</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Claim)
 */
@Serializable
@SerialName("ClaimDiagnosis")
data class ClaimDiagnosis(

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
) : FhirClaimDiagnosis {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ClaimDiagnosis"
    }
}

/**
 * FhirClaimInsurance
 *
 * Financial instruments for reimbursement for the health care products and services specified on the
 * claim.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Claim">ClaimInsurance</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Claim)
 */
interface FhirClaimInsurance : FhirBackboneElement {

    /**
     * Insurance instance identifier.
     */
    val sequence: PositiveInteger

    /**
     * Coverage to be used for adjudication.
     */
    val focal: Bool

    /**
     * Pre-assigned Claim number.
     */
    val identifier: Identifier?

    /**
     * Insurance information.
     */
    val coverage: Reference

    /**
     * Additional provider contract number.
     */
    val businessArrangement: String?

    /**
     * Prior authorization reference number.
     */
    val preAuthRef: kotlin.collections.List<String>?

    /**
     * Adjudication results.
     */
    val claimResponse: Reference?
}

/**
 * ClaimInsurance
 *
 * Financial instruments for reimbursement for the health care products and services specified on the
 * claim.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Claim">ClaimInsurance</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Claim)
 */
@Serializable
@SerialName("ClaimInsurance")
data class ClaimInsurance(

    @SerialName("sequence")
    override val sequence: PositiveInteger,

    @SerialName("focal")
    override val focal: Bool,

    @SerialName("identifier")
    override val identifier: Identifier? = null,

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
) : FhirClaimInsurance {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ClaimInsurance"
    }
}

/**
 * FhirClaimItem
 *
 * A claim line. Either a simple product or service or a 'group' of details which can each be a simple
 * items or groups of sub-details.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Claim">ClaimItem</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Claim)
 */
interface FhirClaimItem : FhirBackboneElement {

    /**
     * Item instance identifier.
     */
    val sequence: PositiveInteger

    /**
     * Applicable careTeam members.
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
     * Product or service provided.
     */
    val detail: kotlin.collections.List<ClaimItemDetail>?
}

/**
 * ClaimItem
 *
 * A claim line. Either a simple product or service or a 'group' of details which can each be a simple
 * items or groups of sub-details.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Claim">ClaimItem</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Claim)
 */
@Serializable
@SerialName("ClaimItem")
data class ClaimItem(

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

    @SerialName("detail")
    override val detail: kotlin.collections.List<ClaimItemDetail>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirClaimItem {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ClaimItem"
    }
}

/**
 * FhirClaimItemDetail
 *
 * A claim detail line. Either a simple (a product or service) or a 'group' of sub-details which are
 * simple items.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Claim">ClaimItemDetail</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Claim)
 */
interface FhirClaimItemDetail : FhirBackboneElement {

    /**
     * Item instance identifier.
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
     * Product or service provided.
     */
    val subDetail: kotlin.collections.List<ClaimItemDetailSubDetail>?
}

/**
 * ClaimItemDetail
 *
 * A claim detail line. Either a simple (a product or service) or a 'group' of sub-details which are
 * simple items.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Claim">ClaimItemDetail</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Claim)
 */
@Serializable
@SerialName("ClaimItemDetail")
data class ClaimItemDetail(

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

    @SerialName("subDetail")
    override val subDetail: kotlin.collections.List<ClaimItemDetailSubDetail>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirClaimItemDetail {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ClaimItemDetail"
    }
}

/**
 * FhirClaimItemDetailSubDetail
 *
 * A claim detail line. Either a simple (a product or service) or a 'group' of sub-details which are
 * simple items.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Claim">ClaimItemDetailSubDetail</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Claim)
 */
interface FhirClaimItemDetailSubDetail : FhirBackboneElement {

    /**
     * Item instance identifier.
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
}

/**
 * ClaimItemDetailSubDetail
 *
 * A claim detail line. Either a simple (a product or service) or a 'group' of sub-details which are
 * simple items.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Claim">ClaimItemDetailSubDetail</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Claim)
 */
@Serializable
@SerialName("ClaimItemDetailSubDetail")
data class ClaimItemDetailSubDetail(

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

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirClaimItemDetailSubDetail {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ClaimItemDetailSubDetail"
    }
}

/**
 * FhirClaimPayee
 *
 * The party to be reimbursed for cost of the products and services according to the terms of the
 * policy.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Claim">ClaimPayee</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Claim)
 */
interface FhirClaimPayee : FhirBackboneElement {

    /**
     * Category of recipient.
     */
    val type: CodeableConcept

    /**
     * Recipient reference.
     */
    val party: Reference?
}

/**
 * ClaimPayee
 *
 * The party to be reimbursed for cost of the products and services according to the terms of the
 * policy.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Claim">ClaimPayee</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Claim)
 */
@Serializable
@SerialName("ClaimPayee")
data class ClaimPayee(

    @SerialName("type")
    override val type: CodeableConcept,

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
) : FhirClaimPayee {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ClaimPayee"
    }
}

/**
 * FhirClaimProcedure
 *
 * Procedures performed on the patient relevant to the billing items with the claim.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Claim">ClaimProcedure</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Claim)
 */
interface FhirClaimProcedure : FhirBackboneElement {

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
 * ClaimProcedure
 *
 * Procedures performed on the patient relevant to the billing items with the claim.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Claim">ClaimProcedure</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Claim)
 */
@Serializable
@SerialName("ClaimProcedure")
data class ClaimProcedure(

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
) : FhirClaimProcedure {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ClaimProcedure"
    }
}

/**
 * FhirClaimRelated
 *
 * Other claims which are related to this claim such as prior submissions or claims for related
 * services or for the same event.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Claim">ClaimRelated</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Claim)
 */
interface FhirClaimRelated : FhirBackboneElement {

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
 * ClaimRelated
 *
 * Other claims which are related to this claim such as prior submissions or claims for related
 * services or for the same event.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Claim">ClaimRelated</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Claim)
 */
@Serializable
@SerialName("ClaimRelated")
data class ClaimRelated(

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
) : FhirClaimRelated {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ClaimRelated"
    }
}

/**
 * FhirClaimSupportingInfo
 *
 * Additional information codes regarding exceptions, special considerations, the condition, situation,
 * prior or concurrent issues.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Claim">ClaimSupportingInfo</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Claim)
 */
interface FhirClaimSupportingInfo : FhirBackboneElement {

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
    val reason: CodeableConcept?
}

/**
 * ClaimSupportingInfo
 *
 * Additional information codes regarding exceptions, special considerations, the condition, situation,
 * prior or concurrent issues.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Claim">ClaimSupportingInfo</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Claim)
 */
@Serializable
@SerialName("ClaimSupportingInfo")
data class ClaimSupportingInfo(

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
    override val reason: CodeableConcept? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirClaimSupportingInfo {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ClaimSupportingInfo"
    }
}
