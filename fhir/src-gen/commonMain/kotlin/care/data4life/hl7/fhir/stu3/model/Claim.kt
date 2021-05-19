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

import care.data4life.hl7.fhir.stu3.codesystem.Use
import care.data4life.hl7.fhir.stu3.primitive.Bool
import care.data4life.hl7.fhir.stu3.primitive.Date
import care.data4life.hl7.fhir.stu3.primitive.DateTime
import care.data4life.hl7.fhir.stu3.primitive.Decimal
import care.data4life.hl7.fhir.stu3.primitive.PositiveInteger
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirClaim
 *
 * A provider issued list of services and products provided, or to be provided, to a patient which is
 * provided to an insurer for payment recovery.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Claim">Claim</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Claim)
 */
interface FhirClaim : FhirDomainResource {

    /**
     * Claim number.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * active | cancelled | draft | entered-in-error.
     */
    val status: String?

    /**
     * Type or discipline.
     */
    val type: CodeableConcept?

    /**
     * Finer grained claim type information.
     */
    val subType: kotlin.collections.List<CodeableConcept>?

    /**
     * Complete (Bill or Claim), Proposed (Pre-Authorization), Exploratory (Pre-
     * determination).
     */
    val use: Use?

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
     * Target.
     */
    val insurer: Reference?

    /**
     * Responsible provider.
     */
    val provider: Reference?

    /**
     * Responsible organization.
     */
    val organization: Reference?

    /**
     * Desired processing priority.
     */
    val priority: CodeableConcept?

    /**
     * Funds requested to be reserved.
     */
    val fundsReserve: CodeableConcept?

    /**
     * Related Claims which may be revelant to processing this claimn.
     */
    val related: kotlin.collections.List<ClaimRelated>?

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
    val payee: ClaimPayee?

    /**
     * Treatment Referral.
     */
    val referral: Reference?

    /**
     * Servicing Facility.
     */
    val facility: Reference?

    /**
     * Members of the care team.
     */
    val careTeam: kotlin.collections.List<ClaimCareTeam>?

    /**
     * Exceptions, special considerations, the condition, situation, prior or
     * concurrent issues.
     */
    val information: kotlin.collections.List<ClaimInformation>?

    /**
     * List of Diagnosis.
     */
    val diagnosis: kotlin.collections.List<ClaimDiagnosis>?

    /**
     * Procedures performed.
     */
    val procedure: kotlin.collections.List<ClaimProcedure>?

    /**
     * Insurance or medical plan.
     */
    val insurance: kotlin.collections.List<ClaimInsurance>?

    /**
     * Details about an accident.
     */
    val accident: ClaimAccident?

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
    val item: kotlin.collections.List<ClaimItem>?

    /**
     * Total claim cost.
     */
    val total: Money?
}

/**
 * Claim
 *
 * A provider issued list of services and products provided, or to be provided, to a patient which is
 * provided to an insurer for payment recovery.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Claim">Claim</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Claim)
 */
@Serializable
@SerialName("Claim")
data class Claim(

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("status")
    override val status: String? = null,

    @SerialName("type")
    override val type: CodeableConcept? = null,

    @SerialName("subType")
    override val subType: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("use")
    override val use: Use? = null,

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

    @SerialName("priority")
    override val priority: CodeableConcept? = null,

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

    @SerialName("information")
    override val information: kotlin.collections.List<ClaimInformation>? = null,

    @SerialName("diagnosis")
    override val diagnosis: kotlin.collections.List<ClaimDiagnosis>? = null,

    @SerialName("procedure")
    override val procedure: kotlin.collections.List<ClaimProcedure>? = null,

    @SerialName("insurance")
    override val insurance: kotlin.collections.List<ClaimInsurance>? = null,

    @SerialName("accident")
    override val accident: ClaimAccident? = null,

    @SerialName("employmentImpacted")
    override val employmentImpacted: Period? = null,

    @SerialName("hospitalization")
    override val hospitalization: Period? = null,

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

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "Claim"
    }
}

/**
 * FhirClaimAccident
 *
 * An accident which resulted in the need for healthcare services.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Claim">ClaimAccident</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Claim)
 */
interface FhirClaimAccident : FhirBackboneElement {

    /**
     * When the accident occurred see information codes see information codes.
     */
    val date: Date

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
 * ClaimAccident
 *
 * An accident which resulted in the need for healthcare services.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Claim">ClaimAccident</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Claim)
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

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ClaimAccident"
    }
}

/**
 * FhirClaimCareTeam
 *
 * The members of the team who provided the overall service as well as their role and whether
 * responsible and qualifications.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Claim">ClaimCareTeam</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Claim)
 */
interface FhirClaimCareTeam : FhirBackboneElement {

    /**
     * Number to covey order of careTeam.
     */
    val sequence: PositiveInteger

    /**
     * Provider individual or organization.
     */
    val provider: Reference

    /**
     * Billing provider.
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
 * ClaimCareTeam
 *
 * The members of the team who provided the overall service as well as their role and whether
 * responsible and qualifications.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Claim">ClaimCareTeam</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Claim)
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

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ClaimCareTeam"
    }
}

/**
 * FhirClaimDiagnosis
 *
 * List of patient diagnosis for which care is sought.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Claim">ClaimDiagnosis</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Claim)
 */
interface FhirClaimDiagnosis : FhirBackboneElement {

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
 * ClaimDiagnosis
 *
 * List of patient diagnosis for which care is sought.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Claim">ClaimDiagnosis</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Claim)
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

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ClaimDiagnosis"
    }
}

/**
 * FhirClaimInformation
 *
 * Additional information codes regarding exceptions, special considerations, the condition, situation,
 * prior or concurrent issues. Often there are mutiple jurisdiction specific valuesets which are
 * required.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Claim">ClaimInformation</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Claim)
 */
interface FhirClaimInformation : FhirBackboneElement {

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
    val reason: CodeableConcept?
}

/**
 * ClaimInformation
 *
 * Additional information codes regarding exceptions, special considerations, the condition, situation,
 * prior or concurrent issues. Often there are mutiple jurisdiction specific valuesets which are
 * required.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Claim">ClaimInformation</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Claim)
 */
@Serializable
@SerialName("ClaimInformation")
data class ClaimInformation(

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
    override val reason: CodeableConcept? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirClaimInformation {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ClaimInformation"
    }
}

/**
 * FhirClaimInsurance
 *
 * Financial instrument by which payment information for health care.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Claim">ClaimInsurance</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Claim)
 */
interface FhirClaimInsurance : FhirBackboneElement {

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
 * ClaimInsurance
 *
 * Financial instrument by which payment information for health care.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Claim">ClaimInsurance</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Claim)
 */
@Serializable
@SerialName("ClaimInsurance")
data class ClaimInsurance(

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
) : FhirClaimInsurance {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ClaimInsurance"
    }
}

/**
 * FhirClaimItem
 *
 * First tier of goods and services.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Claim">ClaimItem</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Claim)
 */
interface FhirClaimItem : FhirBackboneElement {

    /**
     * Service instance.
     */
    val sequence: PositiveInteger

    /**
     * Applicable careTeam members.
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
     * Additional items.
     */
    val detail: kotlin.collections.List<ClaimItemDetail>?
}

/**
 * ClaimItem
 *
 * First tier of goods and services.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Claim">ClaimItem</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Claim)
 */
@Serializable
@SerialName("ClaimItem")
data class ClaimItem(

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

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ClaimItem"
    }
}

/**
 * FhirClaimItemDetail
 *
 * Second tier of goods and services.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Claim">ClaimItemDetail</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Claim)
 */
interface FhirClaimItemDetail : FhirBackboneElement {

    /**
     * Service instance.
     */
    val sequence: PositiveInteger

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
     * Additional items.
     */
    val subDetail: kotlin.collections.List<ClaimItemDetailSubDetail>?
}

/**
 * ClaimItemDetail
 *
 * Second tier of goods and services.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Claim">ClaimItemDetail</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Claim)
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

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ClaimItemDetail"
    }
}

/**
 * FhirClaimItemDetailSubDetail
 *
 * Third tier of goods and services.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Claim">ClaimItemDetailSubDetail</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Claim)
 */
interface FhirClaimItemDetailSubDetail : FhirBackboneElement {

    /**
     * Service instance.
     */
    val sequence: PositiveInteger

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
}

/**
 * ClaimItemDetailSubDetail
 *
 * Third tier of goods and services.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Claim">ClaimItemDetailSubDetail</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Claim)
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

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirClaimItemDetailSubDetail {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ClaimItemDetailSubDetail"
    }
}

/**
 * FhirClaimPayee
 *
 * The party to be reimbursed for the services.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Claim">ClaimPayee</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Claim)
 */
interface FhirClaimPayee : FhirBackboneElement {

    /**
     * Type of party: Subscriber, Provider, other.
     */
    val type: CodeableConcept

    /**
     * organization | patient | practitioner | relatedperson.
     */
    val resType: Coding?

    /**
     * Party to receive the payable.
     */
    val party: Reference?
}

/**
 * ClaimPayee
 *
 * The party to be reimbursed for the services.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Claim">ClaimPayee</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Claim)
 */
@Serializable
@SerialName("ClaimPayee")
data class ClaimPayee(

    @SerialName("type")
    override val type: CodeableConcept,

    @SerialName("resourceType")
    override val resType: Coding? = null,

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

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ClaimPayee"
    }
}

/**
 * FhirClaimProcedure
 *
 * Ordered list of patient procedures performed to support the adjudication.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Claim">ClaimProcedure</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Claim)
 */
interface FhirClaimProcedure : FhirBackboneElement {

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
 * ClaimProcedure
 *
 * Ordered list of patient procedures performed to support the adjudication.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Claim">ClaimProcedure</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Claim)
 */
@Serializable
@SerialName("ClaimProcedure")
data class ClaimProcedure(

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
) : FhirClaimProcedure {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ClaimProcedure"
    }
}

/**
 * FhirClaimRelated
 *
 * Other claims which are related to this claim such as prior claim versions or for related services.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Claim">ClaimRelated</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Claim)
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
     * Related file or case reference.
     */
    val reference: Identifier?
}

/**
 * ClaimRelated
 *
 * Other claims which are related to this claim such as prior claim versions or for related services.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Claim">ClaimRelated</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Claim)
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

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ClaimRelated"
    }
}
