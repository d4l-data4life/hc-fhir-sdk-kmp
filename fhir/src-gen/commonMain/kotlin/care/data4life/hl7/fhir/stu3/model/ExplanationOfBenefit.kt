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

import care.data4life.hl7.fhir.stu3.codesystem.ExplanationOfBenefitStatus
import care.data4life.hl7.fhir.stu3.primitive.Bool
import care.data4life.hl7.fhir.stu3.primitive.Date
import care.data4life.hl7.fhir.stu3.primitive.DateTime
import care.data4life.hl7.fhir.stu3.primitive.Decimal
import care.data4life.hl7.fhir.stu3.primitive.PositiveInteger
import care.data4life.hl7.fhir.stu3.primitive.UnsignedInteger
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
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit)
 */
interface FhirExplanationOfBenefit : FhirDomainResource {

    /**
     * Business Identifier.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * The status of the resource instance.
     */
    val status: ExplanationOfBenefitStatus?

    /**
     * Type or discipline.
     */
    val type: CodeableConcept?

    /**
     * Finer grained claim type information.
     */
    val subType: kotlin.collections.List<CodeableConcept>?

    /**
     * The subject of the Products and Services.
     */
    val patient: Reference?

    /**
     * Period for charge submission.
     */
    val billablePeriod: Period?

    /**
     * Creation date.
     */
    val created: DateTime?

    /**
     * Author.
     */
    val enterer: Reference?

    /**
     * Insurer responsible for the EOB.
     */
    val insurer: Reference?

    /**
     * Responsible provider for the claim.
     */
    val provider: Reference?

    /**
     * Responsible organization for the claim.
     */
    val organization: Reference?

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
     * complete | error | partial.
     */
    val outcome: CodeableConcept?

    /**
     * Disposition Message.
     */
    val disposition: String?

    /**
     * Related Claims which may be revelant to processing this claim.
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
     * Party to be paid any benefits payable.
     */
    val payee: ExplanationOfBenefitPayee?

    /**
     * Exceptions, special considerations, the condition, situation, prior or
     * concurrent issues.
     */
    val information: kotlin.collections.List<ExplanationOfBenefitInformation>?

    /**
     * Care Team members.
     */
    val careTeam: kotlin.collections.List<ExplanationOfBenefitCareTeam>?

    /**
     * List of Diagnosis.
     */
    val diagnosis: kotlin.collections.List<ExplanationOfBenefitDiagnosis>?

    /**
     * Procedures performed.
     */
    val procedure: kotlin.collections.List<ExplanationOfBenefitProcedure>?

    /**
     * Precedence (primary, secondary, etc.).
     */
    val precedence: PositiveInteger?

    /**
     * Insurance or medical plan.
     */
    val insurance: ExplanationOfBenefitInsurance?

    /**
     * Details of an accident.
     */
    val accident: ExplanationOfBenefitAccident?

    /**
     * Period unable to work.
     */
    val employmentImpacted: Period?

    /**
     * Period in hospital.
     */
    val hospitalization: Period?

    /**
     * Goods and Services.
     */
    val item: kotlin.collections.List<ExplanationOfBenefitItem>?

    /**
     * Insurer added line items.
     */
    val addItem: kotlin.collections.List<ExplanationOfBenefitAddItem>?

    /**
     * Total Cost of service from the Claim.
     */
    val totalCost: Money?

    /**
     * Unallocated deductable.
     */
    val unallocDeductable: Money?

    /**
     * Total benefit payable for the Claim.
     */
    val totalBenefit: Money?

    /**
     * Payment (if paid).
     */
    val payment: ExplanationOfBenefitPayment?

    /**
     * Printed Form Identifier.
     */
    val form: CodeableConcept?

    /**
     * Processing notes.
     */
    val processNote: kotlin.collections.List<ExplanationOfBenefitProcessNote>?

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
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit)
 */
@Serializable
@SerialName("ExplanationOfBenefit")
data class ExplanationOfBenefit(

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("status")
    override val status: ExplanationOfBenefitStatus? = null,

    @SerialName("type")
    override val type: CodeableConcept? = null,

    @SerialName("subType")
    override val subType: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("patient")
    override val patient: Reference? = null,

    @SerialName("billablePeriod")
    override val billablePeriod: Period? = null,

    @SerialName("created")
    override val created: DateTime? = null,

    @SerialName("enterer")
    override val enterer: Reference? = null,

    @SerialName("insurer")
    override val insurer: Reference? = null,

    @SerialName("provider")
    override val provider: Reference? = null,

    @SerialName("organization")
    override val organization: Reference? = null,

    @SerialName("referral")
    override val referral: Reference? = null,

    @SerialName("facility")
    override val facility: Reference? = null,

    @SerialName("claim")
    override val claim: Reference? = null,

    @SerialName("claimResponse")
    override val claimResponse: Reference? = null,

    @SerialName("outcome")
    override val outcome: CodeableConcept? = null,

    @SerialName("disposition")
    override val disposition: String? = null,

    @SerialName("related")
    override val related: kotlin.collections.List<ExplanationOfBenefitRelated>? = null,

    @SerialName("prescription")
    override val prescription: Reference? = null,

    @SerialName("originalPrescription")
    override val originalPrescription: Reference? = null,

    @SerialName("payee")
    override val payee: ExplanationOfBenefitPayee? = null,

    @SerialName("information")
    override val information: kotlin.collections.List<ExplanationOfBenefitInformation>? = null,

    @SerialName("careTeam")
    override val careTeam: kotlin.collections.List<ExplanationOfBenefitCareTeam>? = null,

    @SerialName("diagnosis")
    override val diagnosis: kotlin.collections.List<ExplanationOfBenefitDiagnosis>? = null,

    @SerialName("procedure")
    override val procedure: kotlin.collections.List<ExplanationOfBenefitProcedure>? = null,

    @SerialName("precedence")
    override val precedence: PositiveInteger? = null,

    @SerialName("insurance")
    override val insurance: ExplanationOfBenefitInsurance? = null,

    @SerialName("accident")
    override val accident: ExplanationOfBenefitAccident? = null,

    @SerialName("employmentImpacted")
    override val employmentImpacted: Period? = null,

    @SerialName("hospitalization")
    override val hospitalization: Period? = null,

    @SerialName("item")
    override val item: kotlin.collections.List<ExplanationOfBenefitItem>? = null,

    @SerialName("addItem")
    override val addItem: kotlin.collections.List<ExplanationOfBenefitAddItem>? = null,

    @SerialName("totalCost")
    override val totalCost: Money? = null,

    @SerialName("unallocDeductable")
    override val unallocDeductable: Money? = null,

    @SerialName("totalBenefit")
    override val totalBenefit: Money? = null,

    @SerialName("payment")
    override val payment: ExplanationOfBenefitPayment? = null,

    @SerialName("form")
    override val form: CodeableConcept? = null,

    @SerialName("processNote")
    override val processNote: kotlin.collections.List<ExplanationOfBenefitProcessNote>? = null,

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

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ExplanationOfBenefit"
    }
}

/**
 * FhirExplanationOfBenefitAccident
 *
 * An accident which resulted in the need for healthcare services.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit">ExplanationOfBenefitAccident</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit)
 */
interface FhirExplanationOfBenefitAccident : FhirBackboneElement {

    /**
     * When the accident occurred.
     */
    val date: Date?

    /**
     * The nature of the accident.
     */
    val type: CodeableConcept?

    /**
     * Accident Place.
     */
    val locationAddress: Address?

    /**
     * Accident Place.
     */
    val locationReference: Reference?
}

/**
 * ExplanationOfBenefitAccident
 *
 * An accident which resulted in the need for healthcare services.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit">ExplanationOfBenefitAccident</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit)
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

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ExplanationOfBenefitAccident"
    }
}

/**
 * FhirExplanationOfBenefitAddItem
 *
 * The first tier service adjudications for payor added services.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit">ExplanationOfBenefitAddItem</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit)
 */
interface FhirExplanationOfBenefitAddItem : FhirBackboneElement {

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
     * Billing Code.
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
    val adjudication: kotlin.collections.List<ExplanationOfBenefitItemAdjudication>?

    /**
     * Added items details.
     */
    val detail: kotlin.collections.List<ExplanationOfBenefitAddItemDetail>?
}

/**
 * ExplanationOfBenefitAddItem
 *
 * The first tier service adjudications for payor added services.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit">ExplanationOfBenefitAddItem</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit)
 */
@Serializable
@SerialName("ExplanationOfBenefitAddItem")
data class ExplanationOfBenefitAddItem(

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

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ExplanationOfBenefitAddItem"
    }
}

/**
 * FhirExplanationOfBenefitAddItemDetail
 *
 * The second tier service adjudications for payor added services.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit">ExplanationOfBenefitAddItemDetail</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit)
 */
interface FhirExplanationOfBenefitAddItemDetail : FhirBackboneElement {

    /**
     * Revenue or cost center code.
     */
    val revenue: CodeableConcept?

    /**
     * Type of service or product.
     */
    val category: CodeableConcept?

    /**
     * Billing Code.
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
    val adjudication: kotlin.collections.List<ExplanationOfBenefitItemAdjudication>?
}

/**
 * ExplanationOfBenefitAddItemDetail
 *
 * The second tier service adjudications for payor added services.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit">ExplanationOfBenefitAddItemDetail</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit)
 */
@Serializable
@SerialName("ExplanationOfBenefitAddItemDetail")
data class ExplanationOfBenefitAddItemDetail(

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
    override val adjudication: kotlin.collections.List<ExplanationOfBenefitItemAdjudication>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirExplanationOfBenefitAddItemDetail {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ExplanationOfBenefitAddItemDetail"
    }
}

/**
 * FhirExplanationOfBenefitBenefitBalance
 *
 * Balance by Benefit Category
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit">ExplanationOfBenefitBenefitBalance</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit)
 */
interface FhirExplanationOfBenefitBenefitBalance : FhirBackboneElement {

    /**
     * Type of services covered.
     */
    val category: CodeableConcept

    /**
     * Detailed services covered within the type.
     */
    val subCategory: CodeableConcept?

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
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit)
 */
@Serializable
@SerialName("ExplanationOfBenefitBenefitBalance")
data class ExplanationOfBenefitBenefitBalance(

    @SerialName("category")
    override val category: CodeableConcept,

    @SerialName("subCategory")
    override val subCategory: CodeableConcept? = null,

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

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ExplanationOfBenefitBenefitBalance"
    }
}

/**
 * FhirExplanationOfBenefitBenefitBalanceFinancial
 *
 * Benefits Used to date.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit">ExplanationOfBenefitBenefitBalanceFinancial</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit)
 */
interface FhirExplanationOfBenefitBenefitBalanceFinancial : FhirBackboneElement {

    /**
     * Deductable, visits, benefit amount.
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
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit)
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

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ExplanationOfBenefitBenefitBalanceFinancial"
    }
}

/**
 * FhirExplanationOfBenefitCareTeam
 *
 * The members of the team who provided the overall service as well as their role and whether
 * responsible and qualifications.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit">ExplanationOfBenefitCareTeam</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit)
 */
interface FhirExplanationOfBenefitCareTeam : FhirBackboneElement {

    /**
     * Number to covey order of careteam.
     */
    val sequence: PositiveInteger

    /**
     * Member of the Care Team.
     */
    val provider: Reference

    /**
     * Billing practitioner.
     */
    val responsible: Bool?

    /**
     * Role on the team.
     */
    val role: CodeableConcept?

    /**
     * Type, classification or Specialization.
     */
    val qualification: CodeableConcept?
}

/**
 * ExplanationOfBenefitCareTeam
 *
 * The members of the team who provided the overall service as well as their role and whether
 * responsible and qualifications.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit">ExplanationOfBenefitCareTeam</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit)
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

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ExplanationOfBenefitCareTeam"
    }
}

/**
 * FhirExplanationOfBenefitDiagnosis
 *
 * Ordered list of patient diagnosis for which care is sought.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit">ExplanationOfBenefitDiagnosis</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit)
 */
interface FhirExplanationOfBenefitDiagnosis : FhirBackboneElement {

    /**
     * Number to covey order of diagnosis.
     */
    val sequence: PositiveInteger

    /**
     * Patient's diagnosis.
     */
    val diagnosisCodeableConcept: CodeableConcept?

    /**
     * Patient's diagnosis.
     */
    val diagnosisReference: Reference?

    /**
     * Timing or nature of the diagnosis.
     */
    val type: kotlin.collections.List<CodeableConcept>?

    /**
     * Package billing code.
     */
    val packageCode: CodeableConcept?
}

/**
 * ExplanationOfBenefitDiagnosis
 *
 * Ordered list of patient diagnosis for which care is sought.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit">ExplanationOfBenefitDiagnosis</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit)
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

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ExplanationOfBenefitDiagnosis"
    }
}

/**
 * FhirExplanationOfBenefitInformation
 *
 * Additional information codes regarding exceptions, special considerations, the condition, situation,
 * prior or concurrent issues. Often there are mutiple jurisdiction specific valuesets which are
 * required.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit">ExplanationOfBenefitInformation</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit)
 */
interface FhirExplanationOfBenefitInformation : FhirBackboneElement {

    /**
     * Information instance identifier.
     */
    val sequence: PositiveInteger

    /**
     * General class of information.
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
     * Additional Data or supporting information.
     */
    val valueString: String?

    /**
     * Additional Data or supporting information.
     */
    val valueQuantity: Quantity?

    /**
     * Additional Data or supporting information.
     */
    val valueAttachment: Attachment?

    /**
     * Additional Data or supporting information.
     */
    val valueReference: Reference?

    /**
     * Reason associated with the information.
     */
    val reason: Coding?
}

/**
 * ExplanationOfBenefitInformation
 *
 * Additional information codes regarding exceptions, special considerations, the condition, situation,
 * prior or concurrent issues. Often there are mutiple jurisdiction specific valuesets which are
 * required.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit">ExplanationOfBenefitInformation</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit)
 */
@Serializable
@SerialName("ExplanationOfBenefitInformation")
data class ExplanationOfBenefitInformation(

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
) : FhirExplanationOfBenefitInformation {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ExplanationOfBenefitInformation"
    }
}

/**
 * FhirExplanationOfBenefitInsurance
 *
 * Financial instrument by which payment information for health care.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit">ExplanationOfBenefitInsurance</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit)
 */
interface FhirExplanationOfBenefitInsurance : FhirBackboneElement {

    /**
     * Insurance information.
     */
    val coverage: Reference?

    /**
     * Pre-Authorization/Determination Reference.
     */
    val preAuthRef: kotlin.collections.List<String>?
}

/**
 * ExplanationOfBenefitInsurance
 *
 * Financial instrument by which payment information for health care.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit">ExplanationOfBenefitInsurance</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit)
 */
@Serializable
@SerialName("ExplanationOfBenefitInsurance")
data class ExplanationOfBenefitInsurance(

    @SerialName("coverage")
    override val coverage: Reference? = null,

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

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ExplanationOfBenefitInsurance"
    }
}

/**
 * FhirExplanationOfBenefitItem
 *
 * First tier of goods and services.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit">ExplanationOfBenefitItem</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit)
 */
interface FhirExplanationOfBenefitItem : FhirBackboneElement {

    /**
     * Service instance.
     */
    val sequence: PositiveInteger

    /**
     * Applicable careteam members.
     */
    val careTeamLinkId: kotlin.collections.List<PositiveInteger>?

    /**
     * Applicable diagnoses.
     */
    val diagnosisLinkId: kotlin.collections.List<PositiveInteger>?

    /**
     * Applicable procedures.
     */
    val procedureLinkId: kotlin.collections.List<PositiveInteger>?

    /**
     * Applicable exception and supporting information.
     */
    val informationLinkId: kotlin.collections.List<PositiveInteger>?

    /**
     * Revenue or cost center code.
     */
    val revenue: CodeableConcept?

    /**
     * Type of service or product.
     */
    val category: CodeableConcept?

    /**
     * Billing Code.
     */
    val service: CodeableConcept?

    /**
     * Service/Product billing modifiers.
     */
    val modifier: kotlin.collections.List<CodeableConcept>?

    /**
     * Program specific reason for item inclusion.
     */
    val programCode: kotlin.collections.List<CodeableConcept>?

    /**
     * Date or dates of Service.
     */
    val servicedDate: Date?

    /**
     * Date or dates of Service.
     */
    val servicedPeriod: Period?

    /**
     * Place of service.
     */
    val locationCodeableConcept: CodeableConcept?

    /**
     * Place of service.
     */
    val locationAddress: Address?

    /**
     * Place of service.
     */
    val locationReference: Reference?

    /**
     * Count of Products or Services.
     */
    val quantity: Quantity?

    /**
     * Fee, charge or cost per point.
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
     * Unique Device Identifier.
     */
    val udi: kotlin.collections.List<Reference>?

    /**
     * Service Location.
     */
    val bodySite: CodeableConcept?

    /**
     * Service Sub-location.
     */
    val subSite: kotlin.collections.List<CodeableConcept>?

    /**
     * Encounters related to this billed item.
     */
    val encounter: kotlin.collections.List<Reference>?

    /**
     * List of note numbers which apply.
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
 * First tier of goods and services.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit">ExplanationOfBenefitItem</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit)
 */
@Serializable
@SerialName("ExplanationOfBenefitItem")
data class ExplanationOfBenefitItem(

    @SerialName("sequence")
    override val sequence: PositiveInteger,

    @SerialName("careTeamLinkId")
    override val careTeamLinkId: kotlin.collections.List<PositiveInteger>? = null,

    @SerialName("diagnosisLinkId")
    override val diagnosisLinkId: kotlin.collections.List<PositiveInteger>? = null,

    @SerialName("procedureLinkId")
    override val procedureLinkId: kotlin.collections.List<PositiveInteger>? = null,

    @SerialName("informationLinkId")
    override val informationLinkId: kotlin.collections.List<PositiveInteger>? = null,

    @SerialName("revenue")
    override val revenue: CodeableConcept? = null,

    @SerialName("category")
    override val category: CodeableConcept? = null,

    @SerialName("service")
    override val service: CodeableConcept? = null,

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

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ExplanationOfBenefitItem"
    }
}

/**
 * FhirExplanationOfBenefitItemAdjudication
 *
 * The adjudications results.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit">ExplanationOfBenefitItemAdjudication</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit)
 */
interface FhirExplanationOfBenefitItemAdjudication : FhirBackboneElement {

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
     * Non-monitory value.
     */
    val value: Decimal?
}

/**
 * ExplanationOfBenefitItemAdjudication
 *
 * The adjudications results.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit">ExplanationOfBenefitItemAdjudication</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit)
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

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ExplanationOfBenefitItemAdjudication"
    }
}

/**
 * FhirExplanationOfBenefitItemDetail
 *
 * Second tier of goods and services.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit">ExplanationOfBenefitItemDetail</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit)
 */
interface FhirExplanationOfBenefitItemDetail : FhirBackboneElement {

    /**
     * Service instance.
     */
    val sequence: PositiveInteger

    /**
     * Group or type of product or service.
     */
    val type: CodeableConcept

    /**
     * Revenue or cost center code.
     */
    val revenue: CodeableConcept?

    /**
     * Type of service or product.
     */
    val category: CodeableConcept?

    /**
     * Billing Code.
     */
    val service: CodeableConcept?

    /**
     * Service/Product billing modifiers.
     */
    val modifier: kotlin.collections.List<CodeableConcept>?

    /**
     * Program specific reason for item inclusion.
     */
    val programCode: kotlin.collections.List<CodeableConcept>?

    /**
     * Count of Products or Services.
     */
    val quantity: Quantity?

    /**
     * Fee, charge or cost per point.
     */
    val unitPrice: Money?

    /**
     * Price scaling factor.
     */
    val factor: Decimal?

    /**
     * Total additional item cost.
     */
    val net: Money?

    /**
     * Unique Device Identifier.
     */
    val udi: kotlin.collections.List<Reference>?

    /**
     * List of note numbers which apply.
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
 * Second tier of goods and services.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit">ExplanationOfBenefitItemDetail</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit)
 */
@Serializable
@SerialName("ExplanationOfBenefitItemDetail")
data class ExplanationOfBenefitItemDetail(

    @SerialName("sequence")
    override val sequence: PositiveInteger,

    @SerialName("type")
    override val type: CodeableConcept,

    @SerialName("revenue")
    override val revenue: CodeableConcept? = null,

    @SerialName("category")
    override val category: CodeableConcept? = null,

    @SerialName("service")
    override val service: CodeableConcept? = null,

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

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ExplanationOfBenefitItemDetail"
    }
}

/**
 * FhirExplanationOfBenefitItemDetailSubDetail
 *
 * Third tier of goods and services.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit">ExplanationOfBenefitItemDetailSubDetail</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit)
 */
interface FhirExplanationOfBenefitItemDetailSubDetail : FhirBackboneElement {

    /**
     * Service instance.
     */
    val sequence: PositiveInteger

    /**
     * Type of product or service.
     */
    val type: CodeableConcept

    /**
     * Revenue or cost center code.
     */
    val revenue: CodeableConcept?

    /**
     * Type of service or product.
     */
    val category: CodeableConcept?

    /**
     * Billing Code.
     */
    val service: CodeableConcept?

    /**
     * Service/Product billing modifiers.
     */
    val modifier: kotlin.collections.List<CodeableConcept>?

    /**
     * Program specific reason for item inclusion.
     */
    val programCode: kotlin.collections.List<CodeableConcept>?

    /**
     * Count of Products or Services.
     */
    val quantity: Quantity?

    /**
     * Fee, charge or cost per point.
     */
    val unitPrice: Money?

    /**
     * Price scaling factor.
     */
    val factor: Decimal?

    /**
     * Net additional item cost.
     */
    val net: Money?

    /**
     * Unique Device Identifier.
     */
    val udi: kotlin.collections.List<Reference>?

    /**
     * List of note numbers which apply.
     */
    val noteNumber: kotlin.collections.List<PositiveInteger>?

    /**
     * Language if different from the resource.
     */
    val adjudication: kotlin.collections.List<ExplanationOfBenefitItemAdjudication>?
}

/**
 * ExplanationOfBenefitItemDetailSubDetail
 *
 * Third tier of goods and services.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit">ExplanationOfBenefitItemDetailSubDetail</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit)
 */
@Serializable
@SerialName("ExplanationOfBenefitItemDetailSubDetail")
data class ExplanationOfBenefitItemDetailSubDetail(

    @SerialName("sequence")
    override val sequence: PositiveInteger,

    @SerialName("type")
    override val type: CodeableConcept,

    @SerialName("revenue")
    override val revenue: CodeableConcept? = null,

    @SerialName("category")
    override val category: CodeableConcept? = null,

    @SerialName("service")
    override val service: CodeableConcept? = null,

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

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ExplanationOfBenefitItemDetailSubDetail"
    }
}

/**
 * FhirExplanationOfBenefitPayee
 *
 * The party to be reimbursed for the services.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit">ExplanationOfBenefitPayee</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit)
 */
interface FhirExplanationOfBenefitPayee : FhirBackboneElement {

    /**
     * Type of party: Subscriber, Provider, other.
     */
    val type: CodeableConcept?

    /**
     * organization | patient | practitioner | relatedperson.
     */
    val resType: CodeableConcept?

    /**
     * Party to receive the payable.
     */
    val party: Reference?
}

/**
 * ExplanationOfBenefitPayee
 *
 * The party to be reimbursed for the services.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit">ExplanationOfBenefitPayee</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit)
 */
@Serializable
@SerialName("ExplanationOfBenefitPayee")
data class ExplanationOfBenefitPayee(

    @SerialName("type")
    override val type: CodeableConcept? = null,

    @SerialName("resourceType")
    override val resType: CodeableConcept? = null,

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

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ExplanationOfBenefitPayee"
    }
}

/**
 * FhirExplanationOfBenefitPayment
 *
 * Payment details for the claim if the claim has been paid.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit">ExplanationOfBenefitPayment</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit)
 */
interface FhirExplanationOfBenefitPayment : FhirBackboneElement {

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
     * Expected date of Payment.
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
 * ExplanationOfBenefitPayment
 *
 * Payment details for the claim if the claim has been paid.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit">ExplanationOfBenefitPayment</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit)
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

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ExplanationOfBenefitPayment"
    }
}

/**
 * FhirExplanationOfBenefitProcedure
 *
 * Ordered list of patient procedures performed to support the adjudication.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit">ExplanationOfBenefitProcedure</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit)
 */
interface FhirExplanationOfBenefitProcedure : FhirBackboneElement {

    /**
     * Procedure sequence for reference.
     */
    val sequence: PositiveInteger

    /**
     * When the procedure was performed.
     */
    val date: DateTime?

    /**
     * Patient's list of procedures performed.
     */
    val procedureCodeableConcept: CodeableConcept?

    /**
     * Patient's list of procedures performed.
     */
    val procedureReference: Reference?
}

/**
 * ExplanationOfBenefitProcedure
 *
 * Ordered list of patient procedures performed to support the adjudication.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit">ExplanationOfBenefitProcedure</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit)
 */
@Serializable
@SerialName("ExplanationOfBenefitProcedure")
data class ExplanationOfBenefitProcedure(

    @SerialName("sequence")
    override val sequence: PositiveInteger,

    @SerialName("date")
    override val date: DateTime? = null,

    @SerialName("procedureCodeableConcept")
    override val procedureCodeableConcept: CodeableConcept? = null,

    @SerialName("procedureReference")
    override val procedureReference: Reference? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirExplanationOfBenefitProcedure {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ExplanationOfBenefitProcedure"
    }
}

/**
 * FhirExplanationOfBenefitProcessNote
 *
 * Note text.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit">ExplanationOfBenefitProcessNote</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit)
 */
interface FhirExplanationOfBenefitProcessNote : FhirBackboneElement {

    /**
     * Sequence number for this note.
     */
    val number: PositiveInteger?

    /**
     * display | print | printoper.
     */
    val type: CodeableConcept?

    /**
     * Note explanitory text.
     */
    val text: String?

    /**
     * Language if different from the resource.
     */
    val language: CodeableConcept?
}

/**
 * ExplanationOfBenefitProcessNote
 *
 * Note text.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit">ExplanationOfBenefitProcessNote</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit)
 */
@Serializable
@SerialName("ExplanationOfBenefitProcessNote")
data class ExplanationOfBenefitProcessNote(

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
) : FhirExplanationOfBenefitProcessNote {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ExplanationOfBenefitProcessNote"
    }
}

/**
 * FhirExplanationOfBenefitRelated
 *
 * Other claims which are related to this claim such as prior claim versions or for related services.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit">ExplanationOfBenefitRelated</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit)
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
     * Related file or case reference.
     */
    val reference: Identifier?
}

/**
 * ExplanationOfBenefitRelated
 *
 * Other claims which are related to this claim such as prior claim versions or for related services.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit">ExplanationOfBenefitRelated</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ExplanationOfBenefit)
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

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ExplanationOfBenefitRelated"
    }
}
